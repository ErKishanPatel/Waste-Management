package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.Area_VO;
import VO.Schedule_VO;
import VO.Street_VO;
import DAO.Area_DAO;
import DAO.Schedule_DAO;

/**
 * Servlet implementation class U_Progress_Controller
 */
@WebServlet("/U_Progress_Controller")
public class U_Progress_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Progress_Controller() {
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
		String flag=request.getParameter("flag");
		System.out.println("searchFlag");
		if(flag.equals("search"))
		{
			search(request,response);
		}
	}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Area_DAO area_DAO = new Area_DAO();
			List ls =area_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("area", ls);
		
			response.sendRedirect("user/u_progress.jsp");
						
		}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 	
		System.out.println("HiiiiiHello");
		int area=Integer.parseInt(request.getParameter("area"));
		
		Area_VO area_VO = new Area_VO();
		area_VO.setAreaId(area);
		
		Area_DAO area_DAO = new  Area_DAO();
		List l = area_DAO.search(area_VO);
		
	/*	Schedule_DAO schedule_DAO = new Schedule_DAO();
		List l= schedule_DAO.search(schedule_VO);*/
		
		HttpSession r= request.getSession();
		r.setAttribute("areaProgress",l);		
	
		response.sendRedirect("user/u_progress2.jsp");
						
		}

}
