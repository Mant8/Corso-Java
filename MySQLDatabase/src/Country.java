import java.util.ArrayList;

public class Country {
	
	private String code;
	private String name;
	private String continent; //cambiare in enum
	private String region;
	private float surfaceArea;
	private int indepYear;
	private int population;
	private float lifeExpectancy;
	private float gnp;
	private float gnpOld;
	private String localName;
	private String governmentForm;
	private String hearOfState;
	private int capital;
	private String code2;
	
	private ArrayList<City> listaCity;
	private ArrayList<CountryLanguage> listaCl;
	
	
	public Country(String code, String name, String continent, String region, float surfaceArea, int indepYear,
			int population, float lifeExpectancy, float gnp, float gnpOld, String localName, String governmentForm,
			String hearOfState, int capital, String code2 /*, ArrayList<City> listaCity,
			ArrayList<CountryLanguage> listaCl*/) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfaceArea = surfaceArea;
		this.indepYear = indepYear;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.gnp = gnp;
		this.gnpOld = gnpOld;
		this.localName = localName;
		this.governmentForm = governmentForm;
		this.hearOfState = hearOfState;
		this.capital = capital;
		this.code2 = code2;
		
		
		
		this.listaCity = null; // listaCity;
		this.listaCl = null; //listaCl;
	}
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region
				+ ", surfaceArea=" + surfaceArea + ", indepYear=" + indepYear + ", population=" + population
				+ ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp + ", gnpOld=" + gnpOld + ", localName="
				+ localName + ", governmentForm=" + governmentForm + ", hearOfState=" + hearOfState + ", capital="
				+ capital + ", code2=" + code2 + "]";
	}




	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}


	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}


	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}


	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}


	/**
	 * @return the surfaceArea
	 */
	public float getSurfaceArea() {
		return surfaceArea;
	}


	/**
	 * @param surfaceArea the surfaceArea to set
	 */
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}


	/**
	 * @return the indepYear
	 */
	public int getIndepYear() {
		return indepYear;
	}


	/**
	 * @param indepYear the indepYear to set
	 */
	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}


	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}


	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}


	/**
	 * @return the lifeExpentancy
	 */
	public float getLifeExpentancy() {
		return lifeExpectancy;
	}


	/**
	 * @param lifeExpentancy the lifeExpentancy to set
	 */
	public void setLifeExpentancy(float lifeExpentancy) {
		this.lifeExpectancy = lifeExpentancy;
	}


	/**
	 * @return the gnp
	 */
	public float getGnp() {
		return gnp;
	}


	/**
	 * @param gnp the gnp to set
	 */
	public void setGnp(float gnp) {
		this.gnp = gnp;
	}


	/**
	 * @return the gnpOld
	 */
	public float getGnpOld() {
		return gnpOld;
	}


	/**
	 * @param gnpOld the gnpOld to set
	 */
	public void setGnpOld(float gnpOld) {
		this.gnpOld = gnpOld;
	}


	/**
	 * @return the localName
	 */
	public String getLocalName() {
		return localName;
	}


	/**
	 * @param localName the localName to set
	 */
	public void setLocalName(String localName) {
		this.localName = localName;
	}


	/**
	 * @return the governamentForm
	 */
	public String getGovernamentForm() {
		return governmentForm;
	}


	/**
	 * @param governamentForm the governamentForm to set
	 */
	public void setGovernamentForm(String governamentForm) {
		this.governmentForm = governamentForm;
	}


	/**
	 * @return the hearOfState
	 */
	public String getHearOfState() {
		return hearOfState;
	}


	/**
	 * @param hearOfState the hearOfState to set
	 */
	public void setHearOfState(String hearOfState) {
		this.hearOfState = hearOfState;
	}


	/**
	 * @return the capital
	 */
	public int getCapital() {
		return capital;
	}


	/**
	 * @param capital the capital to set
	 */
	public void setCapital(int capital) {
		this.capital = capital;
	}


	/**
	 * @return the code2
	 */
	public String getCode2() {
		return code2;
	}


	/**
	 * @param code2 the code2 to set
	 */
	public void setCode2(String code2) {
		this.code2 = code2;
	}


	/**
	 * @return the listaCity
	 */
	public ArrayList<City> getListaCity() {
		return listaCity;
	}


	/**
	 * @param listaCity the listaCity to set
	 */
	public void setListaCity(ArrayList<City> listaCity) {
		this.listaCity = listaCity;
	}


	/**
	 * @return the listaCl
	 */
	public ArrayList<CountryLanguage> getListaCl() {
		return listaCl;
	}


	/**
	 * @param listaCl the listaCl to set
	 */
	public void setListaCl(ArrayList<CountryLanguage> listaCl) {
		this.listaCl = listaCl;
	}
	
	
	
	
	

}
