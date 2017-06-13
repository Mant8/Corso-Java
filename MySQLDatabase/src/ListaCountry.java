import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListaCountry implements Tab {
	
	private ArrayList<Country> tab;
	
	public ListaCountry() {
		this.tab = new ArrayList<>();
	}
	
	/*Questo metodo � purtroppo enormemente intricato per una questione, il non sapere che l'oggetto resultSet
	potesse essere chiamato una sola volta, ovvero non appena lo invoco per crearmi l'oggetto country va bene, poi
	per� lo invoco di nuovo per crearmi la lista delle citt� dal database e a quel punto succedono i problemi
	perch� il compilatore mi chiude il resulSet precedente (quello invocato per crearmi l'oggetto country appunto)
	per aprirmi il resulSet che mi creer� la lista citt�. A questo punto succede che il primo oggetto country me
	lo crea ma quando si andr� a riattivare il ciclo while per crearmi il secondo oggetto country non trover� alcuna
	corrispondenza perch� l'oggetto resultSet non esister� pi�. La soluzione contorta a questo problema che mi � venuta
	in mente � quella di RICREARMI l'oggetto resultSet per la creazione di country ad ogni fine ciclo, per�
	poich� appunto lo ricreer� da capo allora per non farlo partire ogni volta dalla toogla iniziale ci ho messo
	anche un ciclo for con un contatore che mi far� riniziare la costruzione di country dalla toogla successiva
	e non sempre quella iniziale.
	*/
	
	public void creaTab(Statement sm) {
		
		ResultSet rs;
		try {
			rs = sm.executeQuery("select * from world.country");
			int counter = 0;
			
			Country country = null;
			ListaCitt� cityList = null;
			ListaCountryLanguage clList = null;
			
			while(rs.next()) {
				
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String continent = rs.getString("Continent");
				String region = rs.getString("Region");
				float surfaceArea = rs.getFloat("surfaceArea");
				int indepYear = rs.getInt("IndepYear");
				int population = rs.getInt("Population");
				float lifeExpectancy  = rs.getFloat("lifeExpectancy");
				float gnp  = rs.getFloat("GNP");
				float gnpOld  = rs.getFloat("GNPOld");
				String localName  = rs.getString("LocalName");
				String governmentForm  = rs.getString("GovernmentForm");
				String hearOfState = rs.getString("HeadOfState");
				int capital = rs.getInt("Capital");
				String code2 = rs.getString("Code2");
				
				country = new Country(code, name, continent, region, surfaceArea, indepYear, population, lifeExpectancy, gnp, gnpOld, localName, governmentForm, hearOfState, capital, code2);
				this.tab.add(country);
				
				
				//Settiamo le citt� del database che hanno lo stesso code dell'oggetto country appena creato
				
				cityList = new ListaCitt�();
				String queryCityCode = "select * from world.city where city.countryCode = '" + code + "'";
				
				cityList.creaTab(sm, queryCityCode);
				country.setListaCity(cityList.getTab());

				
				
				
				//Settiamo le countryLanguage del database che hanno lo stesso code dell'oggetto country appena creato
				
				clList = new ListaCountryLanguage();
				String queryClCode = "select * from world.countryLanguage where countryLanguage.countryCode = '" + code + "'";
				
				clList.creaTab(sm, queryClCode);
				country.setListaCl(clList.getTab());
				
				
				
				//Il ciclo for contorto che mi serve affinch� il metodo funzioni
				counter++;
				rs = sm.executeQuery("select * from world.country");
				for(int i = 0; i < counter; i++) rs.next();
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
	public ArrayList<Country> getTab() {
		return this.tab;
	}

	/**
	 * @param tab the tab to set
	 */
	public void setTab(ArrayList<Country> tab) {
		this.tab = tab;
	}

}
