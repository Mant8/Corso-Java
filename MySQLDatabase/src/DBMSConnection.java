import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;

import java.io.LineNumberInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBMSConnection {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //cariare in memoria che ci sta un driver
			//Il drive manager ti creo una connessione con l'indirizzo del db, nome utente e pass per accedere al db
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false", "root", "tirocinio123");
			//jdbc:mysql questo Ë il protocollo di comunicazione
			//localhost = 127.0.0.1 Ë la nostra macchina
			
			
			
			//ora devo creare un canale di connessione, scrivere connection.createStatement() e poi ctrl+1
			Statement createStatement = connection.createStatement();
			
			
			
			/*
			//ora creato lo statement possiamo dire qualcosa al db
			ResultSet resultSet = createStatement.executeQuery("select name, district from city");
			
			
			
			//ad ogni iterazione di questo file andremo su una toogla successiva
			//ed assegnamo a name una stringa con elemento name del db e lo stesso per district
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				String district = resultSet.getString("district");
				System.out.println(name + " " + district); 
			}*/
			
			ConfigurazioneDB conf = new ConfigurazioneDB(createStatement);
			
			conf.listaCitt‡TramiteAbitanti(450000);
			
			conf.nazioniConAspettativaVitaConFiltroNazione(65, "AFRICA");
			
			conf.citt‡Politica("republic");
			
			
			
			
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
