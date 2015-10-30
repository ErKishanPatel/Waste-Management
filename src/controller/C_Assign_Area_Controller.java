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
import DAO.Street_DAO;
import DAO.Subcat_DAO;
import DAO.Ward_DAO;
import DAO.Zone_DAO;
import VO.Area_VO;
import VO.C_Assign_Area_VO;
import VO.C_Staff_VO;
import VO.Street_VO;
import VO.Subcat_VO;
import VO.Ward_VO;
import VO.Zone_VO;

/**
 * Servlet implementation class C_Assign_Area_Controller
 */
@WebServlet("/C_Assign_Area_Controller")
public class C_Assign_Area_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_Assign_Area_Controller() {
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
		if(flag.equals("search"))
		{
			search(request,response);
		}
		if(flag.equals("edit"))
		{
			edit(request,response);
		}
		if(flag.equals("delete"))
		{
			delete(request,response);
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
		if(flag.equals("update"))
		{ 
			update(request,response);
		}
	}
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("HHIiiiiiiiiiiiii");
		String van_NO =request.getParameter("van_no");
		
		int j = Integer.parseInt(request.getParameter("staff"));
        int i = Integer.parseInt(request.getParameter("area"));
        System.out.println("oooooooooooooooooo");
               
		
		C_Staff_VO c_Staff_VO = new C_Staff_VO();
		c_Staff_VO.setStaffId(j);
		
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaId(i);
		
		C_Assign_Area_VO c_Assign_Area_VO = new C_Assign_Area_VO();
		c_Assign_Area_VO.setVanNo(van_NO);
		c_Assign_Area_VO.setLm(area_VO);
	    System.out.println("before");
		c_Assign_Area_VO.setStf(c_Staff_VO);
	    System.out.println("after");
	
		C_Assign_Area_DAO c_Assign_Area_DAO = new C_Assign_Area_DAO();
		c_Assign_Area_DAO.insert(c_Assign_Area_VO);	
		search(request,response);
		
		
	}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Area_DAO area_DAO = new Area_DAO();
			List ls =area_DAO.load();
			C_Staff_DAO c_Staff_DAO = new C_Staff_DAO();			
			List ls1 =c_Staff_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("area", ls);
			r.setAttribute("staff", ls1);
			response.sendRedirect("admin/c_assign_area.jsp");
						
		}


	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		C_Assign_Area_DAO c_Assign_Area_DAO = new C_Assign_Area_DAO();
			
		c_Assign_Area_DAO.search();
		List<?> list =c_Assign_Area_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("asArea", list);
		response.sendRedirect("admin/c_search_assign_area.jsp");
		
		
		
	}
	
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		int assignaId =Integer.parseInt(request.getParameter("id"));
		C_Assign_Area_VO c_Assign_Area_VO = new C_Assign_Area_VO();
		c_Assign_Area_VO.setAssignaId(assignaId);
		
		
		HttpSession r= request.getSession();
		
		C_Staff_DAO c_Staff_DAO = new C_Staff_DAO();
		List ls1 =c_Staff_DAO.load();
		r.setAttribute("staff", ls1);
		
		Area_DAO area_DAO=new Area_DAO();
		List ls3=area_DAO.load();
		r.setAttribute("area", ls3);

		C_Assign_Area_DAO c_Assign_Area_DAO = new C_Assign_Area_DAO();
		List list =c_Assign_Area_DAO.edit(c_Assign_Area_VO);
		r.setAttribute("editassign_area", list);
		
			response.sendRedirect("admin/editassign_area.jsp");
	
	}
	
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("^_^");
		String van_NO =request.getParameter("van_no");
		System.out.println("^_^");
		int ld=Integer.parseInt(request.getParameter("id"));
		int pd=Integer.parseInt(request.getParameter("staff"));
		int ed=Integer.parseInt(request.getParameter("area"));
		
		
		System.out.println("Data:"+ed+pd+ld);
		//System.out.println("11111111111");
		
		C_Staff_VO c_Staff_VO = new C_Staff_VO();
		Area_VO area_VO=new Area_VO();
		C_Assign_Area_VO c_Assign_Area_VO = new C_Assign_Area_VO();
		
		
		c_Assign_Area_VO.setVanNo(van_NO);
		c_Assign_Area_VO.setAssignaId(ld);
		
		c_Staff_VO.setStaffId(pd);
		area_VO.setAreaId(ed);
		
		
		c_Assign_Area_VO.setStf(c_Staff_VO);	
		c_Assign_Area_VO.setLm(area_VO);
		
		C_Assign_Area_DAO c_Assign_Area_DAO = new C_Assign_Area_DAO();
		c_Assign_Area_DAO.update(c_Assign_Area_VO);	
		search(request,response);
		
	
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int assignaId =Integer.parseInt(request.getParameter("id"));
		System.out.println(assignaId);
		C_Assign_Area_VO c_Assign_Area_VO = new C_Assign_Area_VO();
		c_Assign_Area_VO.setAssignaId(assignaId);
		

		C_Assign_Area_DAO c_Assign_Area_DAO = new C_Assign_Area_DAO();
		c_Assign_Area_DAO.delete(c_Assign_Area_VO);	
		search(request,response);
}
	
}
