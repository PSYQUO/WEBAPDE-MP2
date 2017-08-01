package mp2.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	public RegisterServlet()
	{
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String username = request.getParameter("username");
		String description = request.getParameter("description");
		
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("description", description);
		
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(60*60*24*7*3);
		response.addCookie(cookie);
		
		request.getRequestDispatcher("feed.jsp").forward(request, response);
	}
}
