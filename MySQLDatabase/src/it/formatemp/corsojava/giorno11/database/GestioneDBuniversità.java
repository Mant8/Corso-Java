package it.formatemp.corsojava.giorno11.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioneDBuniversità {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cosa vuoi fare?" +
		"\n1) Aggiungere" +
		"\n2) Leggere" +
		"\n3) Modificare" +
		"\n4) Cancella");
		
		int key = input.nextInt(); input.nextLine();
		
		
		switch (key) {
		case 1: { System.out.println("Cosa vuoi aggiungere?" +
				"\n1) Studente" +
				"\n2) Esame" +
				"\n3) Esame Svolto");
		
				key = input.nextInt(); input.nextLine(); 
		
					switch (key) {
						case 1: createStudente();
			
							break;
						case 2: createEsame();
				
							break;
						case 3: createEsameSvolto();
					
							break;
						default: System.out.println("Comando non valido.");
							break;
					}
			
			}
			
			break;
		case 2: { System.out.println("Cosa vuoi leggere?" +
				"\n1) Studente" +
				"\n2) Esame" +
				"\n3) Esame Svolto");
		
				key = input.nextInt(); input.nextLine(); 
		
					switch (key) {
						case 1: readStudente();
			
							break;
						case 2: readEsame();
				
							break;
						case 3:
					
							break;
						default: System.out.println("Comando non valido.");
							break;
					}
			
			}
			
			break;
		case 3: { System.out.println("Cosa vuoi modificare?" +
				"\n1) Studente" +
				"\n2) Esame" +
				"\n3) Esame Svolto");
		
				key = input.nextInt(); input.nextLine(); 
		
					switch (key) {
						case 1: modificaStudente();
			
							break;
						case 2: createEsame();
				
							break;
						case 3: createEsameSvolto();
					
							break;
						default: System.out.println("Comando non valido.");
							break;
					}
			
			}
			
				
			break;
		case 4: cancellaStudente();
				
			break;

		default: System.out.println("Comando non valido.");
			break;
		}

		
		

	}
	
	public static void createStudente() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci nuovo Studente al database");
			
			System.out.println("Matricola");
			int matricolaStudente = input.nextInt();
			input.nextLine();
			System.out.println("Nome");
			String nomeStudente = input.nextLine();
			System.out.println("Cognome");
			String cognomeStudente = input.nextLine();
			System.out.println("DataDiNascita");
			String dataNascitaStudente = input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"INSERT INTO Studente (Matricola, Nome, Cognome, DataDiNascita) VALUES (?, ?, ?, ?)");
			prepared.setInt(1, matricolaStudente);
			prepared.setString(2, nomeStudente);
			prepared.setString(3, cognomeStudente);
			prepared.setString(4, dataNascitaStudente);
			prepared.execute();
			
			
			System.out.println("Studente aggiunto al database Università");
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void createEsame() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci nuovo Esame al database");
			
			System.out.println("Materia");
			String materia = input.nextLine();
			System.out.println("Crediti");
			int crediti = input.nextInt();
			input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"INSERT INTO Esame (Materia, Crediti) VALUES (?, ?)");
			prepared.setString(1, materia);
			prepared.setInt(2, crediti);
			prepared.execute();
			
			
			System.out.println("Esame aggiunto al database Università");
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	
	}
	
	
	/*In teoria questo metodo avendo come foreign keys gli studenti e gli esami, dovrei creare la tabella scegliendo
	 * la matricola degli studenti dalla tabella studenti e la colonna delle materie dalla tabella esame e poi
	 * controllare che effettivamente i dati inseriti siano corrispondenti alle tabelle studenti e esami
	 */
	public static void createEsameSvolto() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci nuovo Esame svolto al database");
			
			
			
			System.out.println("Matricola studente");
			int matricolaStudente = input.nextInt();
			input.nextLine();
			System.out.println("Materia esame");
			String materia = input.nextLine();
			System.out.println("data esame");
			String data = input.nextLine();
			System.out.println("voto");
			int voto = input.nextInt();
			input.nextLine();
			System.out.println("lode? (1 per si e 0 per no)");
			int lode = input.nextInt();
			input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"INSERT INTO EsameSvolto (Studente, Esame, DataEsameSvolto, Voto, Lode) VALUES (?, ?, ?, ?, ?)");
			prepared.setInt(1, matricolaStudente);
			prepared.setString(2, materia);
			prepared.setString(3, data);
			prepared.setInt(4, voto);
			prepared.setInt(5, lode);
			prepared.execute();
			
			
			System.out.println("Esame svolto aggiunto al database Università");
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void readStudente() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci la matricola dello studente che vuoi cercare");
			
			
			int matricola = input.nextInt();
			input.nextLine();
			
			input.close();
			
			

			PreparedStatement prepared = connection.prepareStatement( "SELECT * from Studente where Matricola = ?" );
			prepared.setInt(1, matricola);
			
			ResultSet executeQuery = prepared.executeQuery();
			
			
			while (executeQuery.next()) {
				int matricolaStudente = executeQuery.getInt("Matricola");
				String nome = executeQuery.getString("Nome");
				String cognome = executeQuery.getString("Cognome");
				String dataNascita = executeQuery.getString("DataDiNascita");
				System.out.println(matricolaStudente + " " + nome + " "+ cognome + " " + dataNascita);
			}
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void readEsame() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci la materia d'esame che vuoi cercare");
			
			String materia = input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"SELECT * from Esame where Materia = ?");
			prepared.setString(1, materia);
			
			ResultSet executeQuery = prepared.executeQuery();
			
			
			while (executeQuery.next()) {
				String nomeMateria = executeQuery.getString("Materia");
				int crediti = executeQuery.getInt("Crediti");
				System.out.println(nomeMateria + " " + crediti);
			}
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	//In realtà dovrei poter scegliere quale attributo della tabella dovrei modificare
	public static void modificaStudente() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Modifica del nome di uno studente, immetti la matricola dello studente cui vuoi modificare il nome");
			
			int matricola = input.nextInt();
			input.nextLine();
			
			System.out.println("Inserisci il nome nuovo");
			String nome = input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"UPDATE Studente SET Nome = ? WHERE Matricola = ?");
			prepared.setString(1, nome);
			prepared.setInt(2, matricola);
			
			prepared.executeUpdate();
			
			System.out.println("Modificato Nome dello studente " + matricola );
			
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void cancellaStudente() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Università", "root", "tirocinio123");
			
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Inserisci la matricola dello studente che vuoi cancellare");
			int matricola = input.nextInt();
			input.nextLine();
			
			input.close();
			

			PreparedStatement prepared = connection.prepareStatement(
					"DELETE FROM Studente WHERE Matricola = ?");
			prepared.setInt(1, matricola);
			
			prepared.executeUpdate();
			
			System.out.println("Cancellato Studente "+ matricola);
			
		}
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
