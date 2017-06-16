package gestionalePasticceria;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GestioneCliente {

	public static boolean verificaRegistrazione(Cliente cliente) {
		boolean verifica = false;
		String codFiscale = cliente.getCodiceFiscale().toUpperCase();
		String regexCF = "[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]";
		if (cliente.getNome() != null && cliente.getCognome() != null && Pattern.matches(regexCF, codFiscale)) {
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
