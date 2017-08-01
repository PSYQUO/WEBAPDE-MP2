package mp2.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public LogoutServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//Kill "session"
		request.getSession().invalidate();
		
		//Kill cookie
		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie: cookies)
		{
			if(cookie.getName().equals("username"))
			{
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
		
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
