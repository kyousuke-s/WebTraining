package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hero;
import model.HeroStatus;

@WebServlet("/HeroMake")
public class HeroMake extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/heroMake.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");

		Hero hero=new Hero();
		hero.setName(name);

		HeroStatus heroStatus=new HeroStatus();
		heroStatus.firstStatus(hero);

		request.setAttribute("hero", hero);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/heroMakeComp.jsp");
		dispatcher.forward(request, response);
	}

}
