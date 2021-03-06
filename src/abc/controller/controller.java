package abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/enviar"})
public class controller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String alias = request.getServletPath();
		
		if (alias.equals("/enviar")) {
			sentData(request, response);
		}
	}
	
	private void sentData(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String dni = request.getParameter("dni");		
		System.out.println("dni" + dni);
	}
	
}
