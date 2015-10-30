package controller;
import VO.Area_VO;
import VO.Ward_VO;
import VO.Zone_VO;
import DAO.Area_DAO;
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
 * Servlet implementation class Area_Controller
 */
@WebServlet("/Area_Controller")
public class Area_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Area_Controller() {
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
		if(flag.equals("loadWard"))
		{ 
			loadWard(request,response);
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
	private void loadWard(HttpServletRequest request,
			HttpServletResponse response) throws IOException 
	{
		Zone_VO zone_VO= new Zone_VO();
		zone_VO.setZoneId(Integer.parseInt(request.getParameter("zoneId")));
	
		System.out.println("id is jj"+request.getParameter("zoneId"));
		Ward_VO ward_VO = new Ward_VO();
		ward_VO.setMc(zone_VO);
	
	
		Ward_DAO ward_DAO = new Ward_DAO();		
		List<?> l=ward_DAO.loadWard(ward_VO);
		HttpSession hs=request.getSession();
		hs.setAttribute("loadWard", l);
		response.sendRedirect("admin/loadWard.jsp");
	}
	
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String areaName =request.getParameter("area_name");
		String areaDes =request.getParameter("area_des");
		System.out.println(areaDes + areaName);
        int i = Integer.parseInt(request.getParameter("wardId"));
        int j = Integer.parseInt(request.getParameter("zoneId"));
		
		Ward_VO ward_VO = new Ward_VO();
		ward_VO.setWardId(i);
		
		Zone_VO zone_VO = new Zone_VO();
		zone_VO.setZoneId(j);
		
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaName(areaName);
		area_VO.setAreaDes(areaDes);
		area_VO.setMc(zone_VO);
		area_VO.setJh(ward_VO);
		
		Area_DAO area_DAO=new Area_DAO();
		area_DAO.insert(area_VO);
		search(request,response);
		
		
}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Ward_DAO l= new Ward_DAO();
			List ls =l.load();
			Zone_DAO m= new Zone_DAO();
			List ls1 =m.load();
			HttpSession r= request.getSession();
			r.setAttribute("ward", ls);
			r.setAttribute("zone", ls1);
			response.sendRedirect("admin/manage_area.jsp");
			
			
			
		}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Area_DAO area_DAO=new Area_DAO();			
		area_DAO.search();
		List list =area_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("area", list);
		response.sendRedirect("admin/search_area.jsp");
		
		
		
	}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		
		int areaId =Integer.parseInt(request.getParameter("id"));
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaId(areaId);
		
		HttpSession r= request.getSession();
		
		Zone_DAO zone_DAO= new Zone_DAO();
		List ls1 =zone_DAO.load();
		r.setAttribute("zone", ls1);
		
		
		Ward_DAO ward_DAO= new Ward_DAO();
		List ls2=ward_DAO.load();
		r.setAttribute("ward", ls2);
		
		
	
		Area_DAO area_DAO=new Area_DAO();
		List list =area_DAO.edit(area_VO);
		r.setAttribute("editarea", list);
		
		response.sendRedirect("admin/editarea.jsp");
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("^_^");
		String areaName =request.getParameter("area");
		String areaDes =request.getParameter("area_des");
		int ld=Integer.parseInt(request.getParameter("id"));
		int pd=Integer.parseInt(request.getParameter("zone_id"));
		int ed=Integer.parseInt(request.getParameter("ward_id"));
		
		System.out.println("Data:"+areaDes +""+ areaName+""+ed+pd+ld);
		//System.out.println("11111111111");
		
		Zone_VO zone_VO=new Zone_VO();
		Ward_VO ward_VO=new Ward_VO();
		Area_VO area_VO=new Area_VO();
		
		area_VO.setAreaName(areaName);
		area_VO.setAreaDes(areaDes);
		area_VO.setAreaId(ld);
		zone_VO.setZoneId(pd);
		ward_VO.setWardId(ed);	
		area_VO.setMc(zone_VO);
		area_VO.setJh(ward_VO);		
		
		Area_DAO area_DAO=new Area_DAO();
		area_DAO.update(area_VO);
		search(request,response);
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int areaId =Integer.parseInt(request.getParameter("id"));
		System.out.println(areaId);
		
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaId(areaId);
		
		Area_DAO area_DAO=new Area_DAO();
		area_DAO.delete(area_VO);
		HttpSession r= request.getSession();
		
		if(!area_DAO.delete(area_VO))
		{
			r.setAttribute("ErrorMsg","Plz Delete Child Class First");
			
		}
		else{
			
			r.removeAttribute("ErrorMsg");
		}
			
		search(request, response);

	}




	

}
