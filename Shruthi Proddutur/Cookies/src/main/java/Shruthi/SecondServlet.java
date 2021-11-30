package Shruthi;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			
			//reading cookies
			Cookie[] ck = request.getCookies();
			//Displaying user name value from cookie
			pwriter.print("Name here: " + ck[0].getValue());
			pwriter.print("Password here: " + ck[1].getValue());
			//pwriter.print("<br><a href = 'welcomehere'>View Details</a></br>");
			pwriter.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
