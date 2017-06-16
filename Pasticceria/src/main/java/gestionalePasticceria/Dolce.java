package gestionalePasticceria;

public class Dolce {

	private String nome;
	private String ingredienteBase;
	private int quantita;

	public Dolce(String nome, String ingredienteBase, int quantita) {
		
		this.nome = nome;
		this.ingredienteBase = ingredienteBase;
		this.quantita = quantita;
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

	@Override
	public String toString() {
		return "Dolce : nome=" + nome + ", a base di =" + ingredienteBase + ", quantita=" + quantita ;
	}
	
	
	
	
}
