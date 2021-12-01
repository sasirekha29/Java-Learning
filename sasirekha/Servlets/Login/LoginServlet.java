/** this servlet is used to get the login page and after the user enters the creditionals it checks with the stored details of the user. If the creditionals are correct it sends direct to the todo servlet or else the same login page servlet is displayed**/

package com.learn.Login;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService loginservice = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name=request.getParameter("name");
		String password =request.getParameter("password");
		boolean isvaliduser=loginservice.ValidateUser(name, password);
		if(isvaliduser)
		{
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/todo.do");	
		}
		else
		{
			
			request.setAttribute("errorMessage","InvalidCredentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}
