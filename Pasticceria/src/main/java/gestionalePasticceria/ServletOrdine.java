package gestionalePasticceria;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOrdine extends HttpServlet {

	GestioneCliente gC = new GestioneCliente();
	ServicesCrud services = new ServicesCrud("jpa-Pasticceria");

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int stato = (int) req.getAttribute("stato");
		switch (stato) {
		case 0:
			String attribute = (String) req.getAttribute("ingrediente");
			List<String> listaIngredienti = gC.elencoIngredienti();
			req.setAttribute("listaIngredienti", listaIngredienti);
			stato = 1;
			RequestDispatcher requestDispatcherObj = req.getRequestDispatcher("/creaOrdine.jsp");
			requestDispatcherObj.forward(req, resp);
			break;
		case 1:
			String attribute2 = (String) req.getAttribute("tipo");
			List<String> listaDolci = gC.elencoDolci();
			req.setAttribute("listaDolci", listaDolci);
			stato = 2;
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/creaOrdine.jsp");
			requestDispatcher.forward(req, resp);
			break;
		case 2:
			String attribute3 = req.getParameter("grammi");
			RequestDispatcher dispatcherObj = req.getRequestDispatcher("/risultato.jsp");
			dispatcherObj.forward(req, resp);
			break;
		}
		
	}
}
