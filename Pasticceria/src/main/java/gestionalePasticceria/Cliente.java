package gestionalePasticceria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente", schema = "pasticceria")
public class Cliente {
	
	@Id
	@GeneratedValue
	private int codiceCliente;
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	@ManyToMany
	private List<Dolce> listaDolci;
	
	public Cliente(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		
		listaDolci = new ArrayList<>();
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
	

	public int getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	
	
	public List<Dolce> getListaDolci() {
		return listaDolci;
	}
	public void setListaDolci(List<Dolce> listaDolci) {
		this.listaDolci = listaDolci;
	}
	@Override
	public String toString() {
		return "Cliente-Tossico : =" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	// Cambiare il toString per non far vedere il nome del Tossico che si vuole drogare tremendamente  
	}
	
	
	
	
}
