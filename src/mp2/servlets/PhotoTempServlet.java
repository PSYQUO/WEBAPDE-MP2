package mp2.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;
import mp2.beans.*;

/**
 * Servlet implementation class PhotoTempServlet
 */
@WebServlet("/PhotoTemp")
public class PhotoTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("PhotoTempServlet - Will send photos");
		
		PhotoDB photoDB = new PhotoDB();		
		
		JSONArray photos = new JSONArray();
		JSONObject responseObj = new JSONObject();
		
		try
		{
			for(String s : photoDB.getFiles())	
				photos.put(s);
			responseObj.put("photos", photos);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("PhotoTempServlet - Unable to send photos");
		}
		
		response.getWriter().write(responseObj.toString());
	}

}
