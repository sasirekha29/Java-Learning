package com.hcl;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Login extends HttpServlet{
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
String email=req.getParameter("val2");

String pw=req.getParameter("val3");
pwriter.println("User Details Page:");
pwriter.println("<p> Hello " +uname +"</p>");
pwriter.println("<p> Your Email is:" +email +"</p>");
pwriter.println("<p> Your Password is **" +pw+ "**"+"</p>");
pwriter.close();
}
}