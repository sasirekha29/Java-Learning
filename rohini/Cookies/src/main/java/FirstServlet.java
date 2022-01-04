import java.io.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	String n=request.getParameter("userName");
	out.print("Welcome "+n);

	Cookie ck=new Cookie("uname",n);//creating cookie object
       	response.addCookie(ck);//adding cookie in the response

	//creating submit button
	out.print("<form action='servlet2' method='post'>");
	out.print("<input type='submit' value='go'>");
	out.print("</form>");
		
	out.close();

        }catch(Exception e){System.out.println(e);}
  }
}

