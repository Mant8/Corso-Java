package gestionalePasticceria;

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


}
