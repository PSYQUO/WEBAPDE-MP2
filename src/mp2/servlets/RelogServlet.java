package mp2.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Relog")
public class RelogServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public RelogServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Cookie[] cookies = request.getCookies();
		
		String username = null;
		
		if(cookies != null)
		{
			for(Cookie cookie : cookies)
			{
				if(cookie.getName().equals("username"))
				{
					username = cookie.getValue();
					cookie.setMaxAge(60*60*24*365*2);
					cookie.setHttpOnly(true);
					response.addCookie(cookie);
				}
			}
		}
		
		if(username != null)
		{
			System.out.println("RelogServlet - User has cookie");
			request.getSession().setAttribute("username", username);
			request.getRequestDispatcher("feed.jsp").forward(request, response);
		}
		else
			response.sendRedirect("index.html");

			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}
