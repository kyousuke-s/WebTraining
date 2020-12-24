package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");

		String anser = number1 + "+" + number2 + "=" +( Integer.parseInt(number1)+Integer.parseInt(number2));

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>計算結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+anser+"</p>");
		out.println("<a href=\"form.jsp\">戻る</a>");
		//out.println("<a href=\"http://localhost:8080/formLesson2/form.jsp\">戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
