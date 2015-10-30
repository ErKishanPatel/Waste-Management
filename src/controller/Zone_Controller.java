package controller;

import VO.Category_VO;
import VO.Zone_VO;
import DAO.Category_DAO;
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
 * Servlet implementation class Zone_Controller
 */
@WebServlet("/Zone_Controller")
public class Zone_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zone_Controller() {
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
		String zoneName =request.getParameter("zone");
		String zoneDes =request.getParameter("zone_des");
		System.out.println(zoneDes + zoneName);
		
		Zone_VO zone_VO=new Zone_VO();
		zone_VO.setZoneName(zoneName);
		zone_VO.setZoneDes(zoneDes);
		
		Zone_DAO zone_DAO=new Zone_DAO();
		zone_DAO.insert(zone_VO);
		response.sendRedirect("admin/manage_zone.jsp");
		
		
}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		Zone_DAO zone_DAO=new Zone_DAO();
		zone_DAO.search();
		List<?> list =zone_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("zone", list);
		response.sendRedirect("admin/search_zone.jsp");
		
		
		
}
protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		int zoneId =Integer.parseInt(request.getParameter("id"));
		Zone_VO zone_VO=new Zone_VO();
		zone_VO.setZoneId(zoneId);
		
		Zone_DAO zone_DAO=new Zone_DAO();
				
		
		List<?> list =zone_DAO.edit(zone_VO);
		HttpSession r= request.getSession();
		r.setAttribute("editzone", list);
		response.sendRedirect("admin/editzone.jsp");
}
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	System.out.println("11111111111");
	
	String zoneName =request.getParameter("zone");
	String zoneDes =request.getParameter("zone_des");
	int ed=Integer.parseInt(request.getParameter("id"));
	System.out.println("Data: "+zoneDes +""+ zoneName+""+ed);
	
	Zone_VO zone_VO=new Zone_VO();
	zone_VO.setZoneName(zoneName);
	zone_VO.setZoneDes(zoneDes);
	zone_VO.setZoneId(ed);
	
	Zone_DAO zone_DAO=new Zone_DAO();
	zone_DAO.update(zone_VO);
	response.sendRedirect("admin/manage_zone.jsp");
	
	

	
	
	
	
}
protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	int zoneId =Integer.parseInt(request.getParameter("id"));
	
	System.out.println(zoneId);
	Zone_VO zone_VO=new Zone_VO();
	zone_VO.setZoneId(zoneId);
	
	Zone_DAO zone_DAO=new Zone_DAO();
	//category_DAO.delete(category_VO);
	
	HttpSession r= request.getSession();
	
	
	if(!zone_DAO.delete(zone_VO))
	{
		r.setAttribute("ErrorMsg","Plz Delete Child Class First");
		
	}
	else{
		
		r.removeAttribute("ErrorMsg");
	}
	
	search(request, response);
	
}






}
