/*
 * Programma fatto da FRANCESCO
 */




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBMSConnectionSisca {
	/*
	 * - Città con più di ? abitanti - Country che hanno una vita media
	 * inferiore ai ? anni NON africani - Città che appartengono ad uno stato ?
	 * - Inserire una città
	 * 
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "Pharma1234");

			Scanner scanner = new Scanner(System.in);
			System.out.println("La query \"citt� con pi� di X abitanti\", inserire x: ");
			int numeroAbitanti = scanner.nextInt();
			PreparedStatement prepared = connection.prepareStatement("Select * from city where Population > ?");
			prepared.setInt(1, numeroAbitanti);
			scanner.nextLine();
			ResultSet executeQuery = prepared.executeQuery();
			List<City> listaCity = new ArrayList<>();
			while (executeQuery.next()) {
				String name = executeQuery.getString("Name");
				String district = executeQuery.getString("District");
				String country = executeQuery.getString("CountryCode");
				int popul = executeQuery.getInt("Population");
				int id = executeQuery.getInt("ID");
				City nuovaCity = new City(id, name, country, district, popul);
				listaCity.add(nuovaCity);
			}
			listaCity.stream().filter(c -> c.getCountryCode().equals("ITA")).forEach(System.out::println);
			System.out.println("Inserisci età minima");
			prepared = connection
					.prepareStatement("Select * from country where LifeExpectancy < ? AND Continent != \'Africa\'");
			int etaMinima = scanner.nextInt();
			scanner.nextLine();
			prepared.setInt(1, etaMinima);
			ResultSet risultatoEtaMinina = prepared.executeQuery();
			while (risultatoEtaMinina.next()) {
				System.out.println(risultatoEtaMinina.getString("name"));
			}

			System.out.println("Inserisci forma di governo");
			String governo = scanner.nextLine();
			prepared = connection.prepareStatement(
					"Select * from city c, country s where s.GovernmentForm = ? and c.CountryCode = s.Code");
			prepared.setString(1, governo);

			ResultSet gvn = prepared.executeQuery();
			while (gvn.next()) {
				System.out.println(gvn.getString("name"));
			}

			System.out.println("Inseriamo una nuoca città al database");
			System.out.println("Nome");
			String nomeNuovaCitta = scanner.nextLine();
			System.out.println("Country");
			String countryNuovaCitta = scanner.nextLine();
			System.out.println("District");
			String districtNuovaCitta = scanner.nextLine();
			System.out.println("Population");
			int populationNuovaCitta = scanner.nextInt();
			scanner.nextLine();
			System.out.println("id");
			int idNuovaCitta = scanner.nextInt();
			scanner.nextLine();

			prepared = connection.prepareStatement(
					"INSERT INTO City (ID, Name, countryCode, District, Population) VALUES (?, ?, ?, ?, ?)");
			prepared.setInt(1, idNuovaCitta);
			prepared.setString(2, nomeNuovaCitta);
			prepared.setString(3, countryNuovaCitta);
			prepared.setString(4, districtNuovaCitta);
			prepared.setInt(5, populationNuovaCitta);
			prepared.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
