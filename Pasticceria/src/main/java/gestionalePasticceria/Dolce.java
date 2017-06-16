package gestionalePasticceria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dolce", schema = "pasticceria")
public class Dolce {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	private String ingredienteBase;
	private int quantita;
	
	@ManyToOne
	@JoinColumn(name = "codiceCliente")
	private Cliente codiceCliente;

	public Dolce(String nome, String ingredienteBase, int quantita) {
		
		this.nome = nome;
		this.ingredienteBase = ingredienteBase;
		this.quantita = quantita;
		
		codiceCliente = null;
	}

	public Dolce() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredienteBase() {
		return ingredienteBase;
	}

	public void setIngredienteBase(String ingredienteBase) {
		this.ingredienteBase = ingredienteBase;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(Cliente codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	@Override
	public String toString() {
		return "Dolce : nome=" + nome + ", a base di =" + ingredienteBase + ", quantita=" + quantita ;
	}
	
	
	
	
}
