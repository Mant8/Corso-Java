package gestionalePasticceria;

import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtente extends HttpServlet{
	
	GestioneCliente gC = new GestioneCliente();
	ServicesCrud services = new ServicesCrud("jpa-Pasticceria");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String paramenter = req.getParameter("id");
		try{
		int id = Integer.parseInt(paramenter);
		boolean verificaLogin = gC.verificaLogin(id);
		if (verificaLogin) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/creaOrdine.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		} catch (NumberFormatException e) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String cognome = req.getParameter("cognome");
		String codiceFiscale = req.getParameter("codiceFiscale");
		boolean verifica = gC.verificaRegistrazione(codiceFiscale,nome,cognome);
		if (verifica) {
			Cliente cliente = new Cliente(nome, cognome, codiceFiscale);
			services.jpaCreate(cliente);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/registrazione.jsp");
			dispatcher.forward(req, resp);
		}
}
}
