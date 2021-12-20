package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EOCheck extends HttpServlet{
	private static final long serialVersionUID=1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=null;
	try {
		out=res.getWriter();
		int n=Integer.parseInt(req.getParameter("t1"));
	
		if(n%2==0)
			out.println(n+"is even number");
		else
			out.println(n+"is odd number");
	}
	catch (Exception e) {
		out.println("Error:"+e.getMessage());
	}
	
	}
	

}
