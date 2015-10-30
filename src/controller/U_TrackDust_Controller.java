package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Street_DAO;

/**
 * Servlet implementation class U_TrackDust_Controller
 */
@WebServlet("/U_TrackDust_Controller")
public class U_TrackDust_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_TrackDust_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		System.out.println(flag);
		if(flag.equals("load"))
		{
			load(request,response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 	
			System.out.println("hiii");
			Street_DAO street_DAO = new Street_DAO();			
			List ls =street_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("street",ls);
		
			response.sendRedirect("user/u_trackDust.jsp");
						
		}
}
