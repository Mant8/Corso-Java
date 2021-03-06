package gestionalePasticceria;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GestioneCliente {

	public static boolean verificaRegistrazione(String codiceFiscale, String nome, String cognome) {
		boolean verifica = false;
		codiceFiscale.toUpperCase();
		String regexCF = "[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]";
		if (nome != null && cognome != null && Pattern.matches(regexCF, codiceFiscale)) {
			verifica = true;
		} else {
			verifica = false;
		}
		return verifica;
	}
	
//	FARE METODO public verifica login
	
	public static boolean verificaLogin(int idCliente) {
		List<Cliente> listaClienti = listaClienti();
		for(Cliente c : listaClienti)
			if(c.getCodiceCliente() == idCliente)
				return true;
		return false;
	}

	
	public static List<Cliente> listaClienti() {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
		
		lista = crud.jpaRead("Select c FROM Cliente c").getResultList();
		
		return lista ;
	}

	
	public static List<Dolce> listaDolci() {
		
		List<Dolce> lista = new ArrayList<Dolce>();
		
		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
		
		lista = crud.jpaRead("Select d FROM Dolce d").getResultList();
		
		return lista ;
	}
	
	public List<String> elencoDolci() {
		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
		List<String> nomiDolci = new ArrayList<String>();
		nomiDolci = crud.jpaRead("select distinct (p.nome)  from Dolce p").getResultList();
		return nomiDolci;
	}
	
	public List<String> elencoIngredienti() {
		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
		List<String> nomiIngredienti = new ArrayList<String>();
		nomiIngredienti  = crud.jpaRead("select distinct (i.ingredienteBase)  from Dolce i").getResultList();
		return nomiIngredienti ;
	}

	
	
//	public static List<Integer> listaOrdiniPerCliente(int idCliente) {
//		
//		List<Integer> lista = new ArrayList<Integer>();
//		
//		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
//		
//		lista = crud.jpaRead("Select r.id FROM relazioneclientedolce r WHERE codiceCliente = '" + idCliente + "'").getResultList();
//		
//		return lista ;
//	}





}
