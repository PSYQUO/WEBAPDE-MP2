package mp2.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("admin") && password.equals("1234"))
		{
			System.out.println("LoginServlet - user logged in");
				
			//Using "session" to pass attributes 
			request.getSession().setAttribute("username", username);
			
			//Using "cookies" to pass attributes
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(60*60*24*7*3);
			cookie.setHttpOnly(true);
			response.addCookie(cookie);
			
			//Should be last
			request.getRequestDispatcher("feed.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().write("failed");
			response.sendRedirect("index.html");
		}
	}
}
