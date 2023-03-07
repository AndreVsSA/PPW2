package br.edu.iftm.aula.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>"
				+ "<meta charset=''UTF-8/>"
				+ "<title>Hello Java</title></head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Java</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("nome");
		out.println("<html>");
		out.println("<head><title>Hello Java</title></head>");
		out.println("<body>");
		out.println("<h1>Hello "+nome+"!</h1>");
		out.println("</body>");
		out.println("</html>");

	}
	
}
