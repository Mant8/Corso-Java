import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListaCountryLanguage implements Tab {

	private ArrayList<CountryLanguage> tab;

	public ListaCountryLanguage() {
		this.tab = new ArrayList<>();
	}

	public void creaTab(Statement sm) {

		ResultSet rs;
		try {
			rs = sm.executeQuery("select * from world.countryLanguage");

			CountryLanguage cl = null;

			while (rs.next()) {
				String countryCode = rs.getString("CountryCode");
				String language = rs.getString("Language");
				String isOfficialTemp = rs.getString("isOfficial");
				boolean isOfficial;
				if (isOfficialTemp.equals("T"))
					isOfficial = true;
				else
					isOfficial = false;
				int percentage = rs.getInt("Percentage");

				cl = new CountryLanguage(countryCode, language, isOfficial, percentage);
				this.tab.add(cl);
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

			CountryLanguage cl = null;

			while (rs.next()) {
				String countryCode = rs.getString("CountryCode");
				String language = rs.getString("Language");
				String isOfficialTemp = rs.getString("isOfficial");
				boolean isOfficial;
				if (isOfficialTemp.equals("T"))
					isOfficial = true;
				else
					isOfficial = false;
				int percentage = rs.getInt("Percentage");

				cl = new CountryLanguage(countryCode, language, isOfficial, percentage);
				this.tab.add(cl);
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
	public ArrayList<CountryLanguage> getTab() {
		return this.tab;
	}

	/**
	 * @param tab
	 *            the tab to set
	 */
	public void setTab(ArrayList<CountryLanguage> tab) {
		this.tab = tab;
	}

}
