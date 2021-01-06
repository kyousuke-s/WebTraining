package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Inch;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=
			request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inchOrg=request.getParameter("inchOrg");

		Inch inch=new Inch();
		inch.setInch(Double.parseDouble(inchOrg));
		inch.setCm(inch.getInch()*inch.getCM());

		request.setAttribute("inch", inch);

		RequestDispatcher dispatcher=
				request.getRequestDispatcher("/WEB-INF/view/result.jsp");
		dispatcher.forward(request, response);
	}

}
