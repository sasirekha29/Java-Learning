package Shruthi;

import java.io.PrintWriter;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


public class FirstServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			
			String name = request.getParameter("userName");
			String password = request.getParameter("userPassword");
			pwriter.print("Hello there: " + name);
			pwriter.print("Your password is: " + password);
			
			//creating a cookie
			Cookie ck1=new Cookie("userName", name);
			Cookie ck2 = new Cookie("userPassword", password);
			
			//Adding cookies to response holder
			response.addCookie(ck1);
			response.addCookie(ck2);
			
			pwriter.print("<br><a href = 'welcomehere'>View Details</a></br>");
			pwriter.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
