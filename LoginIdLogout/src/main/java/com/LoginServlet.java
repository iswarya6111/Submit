package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	request.getRequestDispatcher("Link.html").include(request, response);
	String name =request.getParameter("name");
	String password = request.getParameter("password");
	
	if(password.equals("ishu")) {
		pw.println("Welcome,"+name);
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
	
}else {
	pw.println("username/password wrong");
	request.getRequestDispatcher("Login.html").include(request, response);
	
}
	pw.close();
	
	
	
	}

}
