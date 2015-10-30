package controller;


import VO.Ward_VO;
import VO.Zone_VO;
import DAO.Ward_DAO;
import DAO.Zone_DAO;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ward_Controller
 */
@WebServlet("/Ward_Controller")
public class Ward_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ward_Controller() {
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
			String wardName =request.getParameter("ward");
			String wardDes =request.getParameter("ward_des");
			System.out.println(wardDes + wardName);
			int i = Integer.parseInt(request.getParameter("zone_id"));
			Zone_VO zone_VO = new Zone_VO();
			zone_VO.setZoneId(i);
			
			Ward_VO ward_VO=new Ward_VO();
			ward_VO.setWardName(wardName);
			ward_VO.setWardDes(wardDes);
			ward_VO.setMc(zone_VO);
			
			Ward_DAO ward_DAO=new Ward_DAO();
			ward_DAO.insert(ward_VO);
			response.sendRedirect("admin/manage_ward.jsp");
			
			
			
	}
		protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
				Zone_DAO l= new Zone_DAO();
				List<?> ls =l.load();
				HttpSession r= request.getSession();
				r.setAttribute("zone", ls);
				response.sendRedirect("admin/manage_ward.jsp");				
				
			}
		protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
			Ward_DAO ward_DAO=new Ward_DAO();
				
			ward_DAO.search();
			List<?> list =ward_DAO.search();
			HttpSession r= request.getSession();
			r.setAttribute("ward", list);
			response.sendRedirect("admin/search_ward.jsp");
			
			
			
		}
		protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{	
			
			int wardId =Integer.parseInt(request.getParameter("id"));
			Ward_VO ward_VO=new Ward_VO();
			ward_VO.setWardId(wardId);
			
			Ward_DAO ward_DAO=new Ward_DAO();
			Zone_DAO l= new Zone_DAO();
			List<?> ls =l.load();
			
			List<?> list =ward_DAO.edit(ward_VO);
			System.out.print("edit size is"+list.size());
			HttpSession r= request.getSession();
			r.setAttribute("editward", list);
			r.setAttribute("zone", ls);
			response.sendRedirect("admin/editward.jsp");
		}

		protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			System.out.println("11111111111");
			String wardName =request.getParameter("ward");
			String wardDes =request.getParameter("ward_des");
			int ed=Integer.parseInt(request.getParameter("id"));
			int pd=Integer.parseInt(request.getParameter("zone_id"));
			System.out.println("Data:"+wardDes +""+ wardName+""+ed+pd);
			//System.out.println("11111111111");
			

			Zone_VO zone_VO=new Zone_VO();
			Ward_VO ward_VO=new Ward_VO();
			ward_VO.setWardName(wardName);
			ward_VO.setWardDes(wardDes);
			ward_VO.setWardId(ed);
			zone_VO.setZoneId(pd);
			
			
			ward_VO.setMc(zone_VO);
			
			
			
			Ward_DAO ward_DAO=new Ward_DAO();
			ward_DAO.update(ward_VO);
			response.sendRedirect("admin/manage_ward.jsp");
			
		}
		
		protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			int wardId =Integer.parseInt(request.getParameter("id"));
			
			System.out.println(wardId);
			Ward_VO ward_VO=new Ward_VO();
			ward_VO.setWardId(wardId);
			
			Ward_DAO ward_DAO=new Ward_DAO();
			//category_DAO.delete(category_VO);
			
			HttpSession r= request.getSession();
			
			
			if(!ward_DAO.delete(ward_VO))
			{
				r.setAttribute("ErrorMsg","Plz Delete Child Class First");
				
			}
			else{
				
				r.removeAttribute("ErrorMsg");
			}
			
			search(request, response);
			
		}




	}


