/ This servlet performs todo operations.

package com.learn.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/todo.do")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoService todoservice=new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("todos",todoservice.getTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String newtodo= request.getParameter("todo");
		todoservice.addTodos(newtodo);
		response.sendRedirect("/todo.do");
	}
}
