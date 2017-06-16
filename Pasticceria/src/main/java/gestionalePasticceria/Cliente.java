package gestionalePasticceria;

public class Cliente {

	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Cliente(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	public Cliente() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	@Override
	public String toString() {
		return "Cliente-Tossico : =" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	// Cambiare il toString per non far vedere il nome del Tossico che si vuole drogare tremendamente  
	}
	
	
	
	
}
