import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class GestioneDB {
	
	public static void main(String[] args) {
		
		
		//Crea tabella city
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false", "root", "tirocinio123");
			Statement createStatement = connection.createStatement();
			
			/*ResultSet resultSet = createStatement.executeQuery("select * from world.city");
			
			ArrayList<City> TabCity = new ArrayList<>();
			City city = null;
			
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("name");
				String countryCode = resultSet.getString("countryCode");
				String district = resultSet.getString("district");
				int population = resultSet.getInt("Population");
				
				city = new City(id, name, countryCode, district, population);
				TabCity.add(city);
			}*/
			
			
			//Crea oggetto lista Country Language
			ListaCittà tabCity = new ListaCittà();
			tabCity.creaTab(createStatement);
			//Stampa tutta la tabella City del DB
			tabCity.getTab().stream().forEach(System.out::println);
			
			
			//Crea oggetto lista Country Language
			ListaCountryLanguage tabCl = new ListaCountryLanguage();
			tabCl.creaTab(createStatement);
			//Stampa tutta la tabella CoutryLanguage del DB
			tabCl.getTab().stream().forEach(System.out::println);
			
			
			//Crea oggetto lista Country
			ListaCountry tabC = new ListaCountry();
			tabC.creaTab(createStatement);
			//Stampa tutta la tabella Country del DB
			tabC.getTab().stream().forEach(System.out::println);
			
			
			System.out.println("La lista città è lunga: " + tabCity.getTab().size());
			
			System.out.println("città con più di 450000 abitanti");
			tabCity.getTab().stream().filter(c -> c.getPopulation()> 450000).map(City::getName).forEach(System.out::println);
			
			
			System.out.println("country che hanno una aspettativa vita inferiore 65 anni e non africani");
			tabC.getTab().stream().filter(c -> c.getLifeExpentancy() < 65 && !(c.getContinent().equals("AFRICA"))).forEach(System.out::println);
			
			
			System.out.println("città che appartengono ad uno stato republicano");
			tabC.getTab().stream().filter(c -> c.getGovernamentForm().equals("Republic")).flatMap(c -> c.getListaCity().stream()).forEach(System.out::println);
			
			/*In alternativa se non avessi creato l'oggetto country con all'interno la lista city e countrylanguage che abbiano lo stesso code ma
			quindi tre oggetti (city, country, countryLanguage) separati tra loro, allora avrei potuto svolgere il metodo con due espressioni lambda
			di questo tipo:
			*/
			List<String> listCode = tabC.getTab().stream().filter(c -> c.getGovernamentForm().equals("Republic")).map(Country::getCode).collect(Collectors.toList());
			listCode.stream().forEach(e -> tabCity.getTab().stream().filter(c -> c.getCountryCode().equals(e)).forEach(System.out::println));
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
