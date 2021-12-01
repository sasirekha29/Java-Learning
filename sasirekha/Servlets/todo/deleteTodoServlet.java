/** This servlet is used to delete the things **/
package com.learn.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/delete-todo.do")
public class deleteTodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoService todoservice=new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		TodoService.deleteTodos(new todo(request.getParameter("todo")));
		response.sendRedirect("/todo.do");
	}
		
}
