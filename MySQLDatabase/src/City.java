
public class City {
	
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	
	public City(int id, String name, String countryCode, String district, int population) {
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}


	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}


	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
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
	
	

}
