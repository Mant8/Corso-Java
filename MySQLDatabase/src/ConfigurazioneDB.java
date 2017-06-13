import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class ConfigurazioneDB {

	private Statement sm;

	public ConfigurazioneDB(Statement sm) {
		this.sm = sm;
	}

	public void listaCitt‡TramiteAbitanti(int abitanti) {
		try {
			ResultSet rs = this.sm.executeQuery("select city.Name, city.Population from world.city where Population >" + abitanti);

			while (rs.next()) {
				String name = rs.getString("name");
				int population = rs.getInt("Population");
				System.out.println(name + " " + population);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void nazioniConAspettativaVitaConFiltroNazione(int et‡, String nazione) {
		try {
			ResultSet rs = this.sm.executeQuery("select * from world.country where country.LifeExpectancy > "
					+ et‡ + " AND (NOT country.Continent = '" + nazione + "')");

			while (rs.next()) {
				String name = rs.getString("name");
				float surfaceArea = rs.getFloat("SurfaceArea");
				System.out.println(name + " " + surfaceArea);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void citt‡Politica(String politica) {
		try {
			ResultSet rs = this.sm.executeQuery("select * from world.country, world.city where country.GovernmentForm = '"
					+ politica + "' AND country.Code = city.CountryCode;");

			while (rs.next()) {
				String name = rs.getString("city.name");
				String headState = rs.getString("HeadOfState");
				System.out.println(name + " " + headState);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
