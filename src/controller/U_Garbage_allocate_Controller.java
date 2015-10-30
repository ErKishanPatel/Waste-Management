package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Area_DAO;
import DAO.C_Assign_Area_DAO;
import DAO.C_Staff_DAO;
import DAO.U_Garbage_allocate_DAO;
import VO.Area_VO;
import VO.C_Assign_Area_VO;
import VO.C_Staff_VO;
import VO.U_Garbage_allocate_VO;

/**
 * Servlet implementation class U_Garbage_allocate_Controller
 */
@WebServlet("/U_Garbage_allocate_Controller")
public class U_Garbage_allocate_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Garbage_allocate_Controller() {
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
		System.out.println(flag);
		if(flag.equals("insert"))
		{
			insert(request,response);
		}
	}
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("HHIiiiiiiiiiiiii");
		String des=request.getParameter("des");		
		int i = Integer.parseInt(request.getParameter("area"));
        System.out.println("oooooooooooooooooo");
               
		
		
		
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaId(i);
		
		U_Garbage_allocate_VO garbage_allocate_VO=new U_Garbage_allocate_VO();
		garbage_allocate_VO.setDes(des);
		garbage_allocate_VO.setAr(area_VO);
		
		U_Garbage_allocate_DAO garbage_allocate_DAO=new U_Garbage_allocate_DAO();
		garbage_allocate_DAO.insert(garbage_allocate_VO);
		response.sendRedirect("user/req_for_garbage_allocation.jsp");
	}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Area_DAO area_DAO = new Area_DAO();
			List ls =area_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("area", ls);
		
			response.sendRedirect("user/req_for_garbage_allocation.jsp");
						
		}

}
