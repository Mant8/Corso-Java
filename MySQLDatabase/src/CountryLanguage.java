
public class CountryLanguage {
	
	private String countryCode;
	private String language;
	private boolean isOfficial;
	private float percentage;
	
	
	public CountryLanguage(String countryCode, String language, boolean isOfficial, float percentage) {
		this.countryCode = countryCode;
		this.language = language;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CountryLanguage [countryCode=" + countryCode + ", language=" + language + ", isOfficial=" + isOfficial
				+ ", percentage=" + percentage + "]";
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}


	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}


	/**
	 * @return the isOfficial
	 */
	public boolean isOfficial() {
		return isOfficial;
	}


	/**
	 * @param isOfficial the isOfficial to set
	 */
	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}


	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}


	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	

}
