import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListaCittà implements Tab {

	private ArrayList<City> tab;

	public ListaCittà() {
		this.tab = new ArrayList<>();
	}

	public void creaTab(Statement sm) {

		ResultSet rs;
		try {
			rs = sm.executeQuery("select * from world.city");

			City city = null;

			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("name");
				String countryCode = rs.getString("countryCode");
				String district = rs.getString("district");
				int population = rs.getInt("Population");

				city = new City(id, name, countryCode, district, population);
				this.tab.add(city);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void creaTab(Statement sm, String query) {

		ResultSet rs;
		try {
			rs = sm.executeQuery(query);

			City city = null;

			while (rs.next()) {
				
				int id = rs.getInt("ID");
				String name = rs.getString("name");
				String countryCode = rs.getString("countryCode");
				String district = rs.getString("district");
				int population = rs.getInt("Population");

				city = new City(id, name, countryCode, district, population);
				this.tab.add(city);
			}
						
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return the tab
	 */
	public ArrayList<City> getTab() {
		return this.tab;
	}

	/**
	 * @param tab
	 *            the tab to set
	 */
	public void setTab(ArrayList<City> tab) {
		this.tab = tab;
	}

}
