package com.anitha;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class demo extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req,HttpServletResponse res)
   throws ServletException,IOException
   {
     res.setContentType("text/html");
     PrintWriter pwriter=res.getWriter();
     String uname=req.getParameter("val1");
     String pw=req.getParameter("val2");
     pwriter.println("User Details Page:");
     pwriter.println("Hello "+uname);
     pwriter.println("Your Password is **"+pw+"**");
     pwriter.close();
  }
}