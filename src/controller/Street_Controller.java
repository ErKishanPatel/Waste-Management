package controller;
import VO.Area_VO;
import VO.Street_VO;
import VO.Subcat_VO;
import VO.Ward_VO;
import VO.Zone_VO;
import DAO.Area_DAO;
import DAO.Street_DAO;
import DAO.Subcat_DAO;
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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Street_Controller
 */
@WebServlet("/Street_Controller")
public class Street_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Street_Controller() {
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
		if(flag.equals("loadArea"))
		{ 
			loadArea(request,response);
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
	private void loadWard(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		Zone_VO zone_VO= new Zone_VO();
		zone_VO.setZoneId(Integer.parseInt(request.getParameter("zoneId")));
	
		System.out.println("idis jj"+request.getParameter("zoneId"));
		Ward_VO ward_VO = new Ward_VO();
		ward_VO.setMc(zone_VO);
	
	
		Ward_DAO ward_DAO = new Ward_DAO();		
		List<?> l=ward_DAO.loadWard(ward_VO);
		HttpSession hs=request.getSession();
		hs.setAttribute("loadWard", l);
		response.sendRedirect("admin/loadWard.jsp");
	}
	
	private void loadArea(HttpServletRequest request,
			HttpServletResponse response) throws IOException 
	{
		System.out.println("In Load Area");
		Ward_VO ward_VO= new Ward_VO();
		ward_VO.setWardId(Integer.parseInt(request.getParameter("wardId")));
	
		System.out.println("idis jj"+request.getParameter("wardId"));
		Area_VO area_VO = new Area_VO();
		area_VO.setJh(ward_VO);
	
	
		Area_DAO area_DAO = new Area_DAO();		
		List l1=area_DAO.loadArea(area_VO);
		
		System.out.println("Load Area Size Is:"+l1.size());
		HttpSession hs=request.getSession();
		hs.setAttribute("loadArea", l1);
		response.sendRedirect("admin/loadArea.jsp");
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String streetName =request.getParameter("street");
		String streetDes =request.getParameter("street_des");
		System.out.println(streetDes + streetName);
		System.out.println("11111111111");
		
		
		Street_VO street_VO=new Street_VO();
		street_VO.setStreetName(streetName);
		street_VO.setStreetDes(streetDes);
	
		
		int i = Integer.parseInt(request.getParameter("wardId"));
        int j = Integer.parseInt(request.getParameter("zoneId"));
        int k = Integer.parseInt(request.getParameter("areaId"));
		
		Ward_VO ward_VO = new Ward_VO();
		ward_VO.setWardId(i);
		Zone_VO zone_VO = new Zone_VO();
		zone_VO.setZoneId(j);
		Area_VO area_VO = new Area_VO();
		area_VO.setAreaId(k);
		street_VO.setMc(zone_VO);
		street_VO.setJh(ward_VO);
		street_VO.setLm(area_VO);
		
		Street_DAO street_DAO=new Street_DAO();
		street_DAO.insert(street_VO);
		search(request,response);
		
		
}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Zone_DAO m= new Zone_DAO();
			List<?> ls1 =m.load();
			
			Ward_DAO l= new Ward_DAO();
			List<?> ls =l.load();
			
			Area_DAO j= new Area_DAO();
			List<?> ls2 =j.load();
			
			HttpSession r= request.getSession();
			
			r.setAttribute("zone", ls1);
			
			r.setAttribute("ward", ls);
			
			r.setAttribute("area", ls2);
			response.sendRedirect("admin/manage_street.jsp");
			
			
			
	}
protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
			Street_DAO street_DAO=new Street_DAO();
			street_DAO.search();
	
		
		List list =street_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("street", list);
		response.sendRedirect("admin/search_street.jsp");
		
		
		
	}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
	
	int streetId =Integer.parseInt(request.getParameter("id"));
	Street_VO street_VO=new Street_VO();
	street_VO.setStreetId(streetId);
	
	
	HttpSession r= request.getSession();
	
	Zone_DAO zone_DAO= new Zone_DAO();
	List ls1 =zone_DAO.load();
	r.setAttribute("zone", ls1);
	
	
	Ward_DAO ward_DAO= new Ward_DAO();
	List ls2=ward_DAO.load();
	r.setAttribute("ward", ls2);
	
	Area_DAO area_DAO=new Area_DAO();
	List ls3=area_DAO.load();
	r.setAttribute("area", ls3);

	Street_DAO street_DAO=new Street_DAO();
	List list =street_DAO.edit(street_VO);
	r.setAttribute("editstreet", list);
	
	
	
	response.sendRedirect("admin/editstreet.jsp");
}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("^_^");
		String streetName =request.getParameter("street");
		String streetDes =request.getParameter("street_des");
		int ld=Integer.parseInt(request.getParameter("id"));
		int pd=Integer.parseInt(request.getParameter("zoneId"));
		int ed=Integer.parseInt(request.getParameter("wardId"));
		int kd=Integer.parseInt(request.getParameter("areaId"));
		
		System.out.println("Data:"+streetDes +""+ streetName+""+ed+pd+ld+kd);
		//System.out.println("11111111111");
		
		Zone_VO zone_VO=new Zone_VO();
		Ward_VO ward_VO=new Ward_VO();
		Area_VO area_VO=new Area_VO();
		Street_VO street_VO=new Street_VO();
		
		street_VO.setStreetName(streetName);
		street_VO.setStreetDes(streetDes);
		street_VO.setStreetId(ld);
		
		zone_VO.setZoneId(pd);
		ward_VO.setWardId(ed);
		area_VO.setAreaId(kd);
		
		street_VO.setMc(zone_VO);
		street_VO.setJh(ward_VO);	
		street_VO.setLm(area_VO);
		
		Street_DAO street_DAO=new Street_DAO();
		street_DAO.update(street_VO);		
		search(request,response);
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		int streetId =Integer.parseInt(request.getParameter("id"));
		System.out.println(streetId);
		Street_VO street_VO=new Street_VO();
		street_VO.setStreetId(streetId);
		
		Street_DAO street_DAO=new Street_DAO();
		//street_DAO.delete(street_VO);
		HttpSession r= request.getSession();
		
		
		if(!street_DAO.delete(street_VO))
		{
			r.setAttribute("ErrorMsg","Plz Delete Child Class First");
			
		}
		else{
			
			r.removeAttribute("ErrorMsg");
		}
		
		search(request, response);
	}
}
