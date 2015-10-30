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
import DAO.Schedule_DAO;
import DAO.Street_DAO;
import DAO.Ward_DAO;
import DAO.Zone_DAO;
import DAO.Dust_DAO;
import VO.Area_VO;
import VO.Dust_VO;
import VO.Schedule_VO;
import VO.Street_VO;
import VO.Ward_VO;
import VO.Zone_VO;
import VO.Road_Side_Unit_VO;
import DAO.Road_Side_Unit_DAO;

/**
 * Servlet implementation class Road_Side_Unit_Controller
 */
@WebServlet("/Road_Side_Unit_Controller")
public class Road_Side_Unit_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Road_Side_Unit_Controller() {
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
		if(flag.equals("loadStreet"))
		{ 
			loadStreet(request,response);
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
		System.out.println("In Load Ward8");
		Zone_VO zone_VO= new Zone_VO();
		zone_VO.setZoneId(Integer.parseInt(request.getParameter("zoneId")));
	
		System.out.println("id of loadward"+request.getParameter("zoneId"));
		Ward_VO ward_VO = new Ward_VO();
		ward_VO.setMc(zone_VO);
	
	
		Ward_DAO ward_DAO = new Ward_DAO();		
		List<?> l=ward_DAO.loadWard(ward_VO);
		HttpSession hs=request.getSession();
		hs.setAttribute("loadWard", l);
		response.sendRedirect("admin/loadWard.jsp");
	}
	
	private void loadArea(HttpServletRequest request,HttpServletResponse response) throws IOException 
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
	
	
	private void loadStreet(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		System.out.println("In Load Street");
		Area_VO area_VO = new Area_VO();
		area_VO.setAreaId(Integer.parseInt(request.getParameter("areaId")));
	
		System.out.println("street"+request.getParameter("areaId"));
		Street_VO street_VO = new Street_VO();
		street_VO.setLm(area_VO);
	
	
		Street_DAO street_DAO = new Street_DAO();		
		List l2=street_DAO.loadStreet(street_VO);
		
		System.out.println("Load Area Size Is:"+l2.size());
		HttpSession hs=request.getSession();
		hs.setAttribute("loadStreet", l2);
		response.sendRedirect("admin/loadStreet.jsp");
	}
	
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		double longi =Double.parseDouble(request.getParameter("longi"));
		double lati =Double.parseDouble(request.getParameter("lati"));
		
		
		System.out.println(longi + lati);
		
		Road_Side_Unit_VO road_Side_Unit_VO=new Road_Side_Unit_VO();
		road_Side_Unit_VO.setLongi(longi);
		road_Side_Unit_VO.setLati(lati);      
		
	
		
		int m = Integer.parseInt(request.getParameter("dustbin_id"));
		 int j = Integer.parseInt(request.getParameter("zoneId"));
		int i = Integer.parseInt(request.getParameter("wardId"));
       
        int k = Integer.parseInt(request.getParameter("areaId"));
        int l = Integer.parseInt(request.getParameter("streetId"));
        
        
        
      		Ward_VO ward_VO = new Ward_VO();
      		ward_VO.setWardId(i);
      		Zone_VO zone_VO = new Zone_VO();
      		zone_VO.setZoneId(j);
      		Area_VO area_VO = new Area_VO();
      		area_VO.setAreaId(k);
      		Street_VO street_VO = new Street_VO();
      		street_VO.setStreetId(l);
      		Dust_VO dust_VO = new Dust_VO();
      		dust_VO.setDustId(m);
      		road_Side_Unit_VO.setMc(zone_VO);
    		road_Side_Unit_VO.setJh(ward_VO);
    		road_Side_Unit_VO.setLm(area_VO);
    		road_Side_Unit_VO.setSt(street_VO);
    		road_Side_Unit_VO.setDt(dust_VO);
    		
		
        System.out.println("11111111111");
		
        
		Road_Side_Unit_DAO road_Side_Unit_DAO=new Road_Side_Unit_DAO();
		road_Side_Unit_DAO.insert(road_Side_Unit_VO);
		search(request,response);
		
}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Ward_DAO i= new Ward_DAO();
			List<?> ls =i.load();
			Zone_DAO j= new Zone_DAO();
			List<?> ls1 =j.load();
			Area_DAO k= new Area_DAO();
			List<?> ls2 =k.load();
			Street_DAO l= new Street_DAO();
			List<?> ls3 =l.load();
			Dust_DAO m= new Dust_DAO();
			List<?> ls4 =m.load();
			
			HttpSession r= request.getSession();
			r.setAttribute("ward", ls);
			r.setAttribute("zone", ls1);
			r.setAttribute("area", ls2);
			r.setAttribute("street", ls3);
			r.setAttribute("dust", ls4);
			
			response.sendRedirect("admin/road_side_unit.jsp");
			
			
			
		}

	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 System.out.println("11111111111");
		Road_Side_Unit_DAO road_Side_Unit_DAO=new Road_Side_Unit_DAO();
		
		road_Side_Unit_DAO.search();

	
	List list =road_Side_Unit_DAO.search();
	HttpSession r= request.getSession();
	r.setAttribute("road", list);
	response.sendRedirect("admin/search_road_side_unit.jsp");
	
	 System.out.println("11111111111");
	
}

	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
	
	int roadId =Integer.parseInt(request.getParameter("id"));
	Road_Side_Unit_VO road_Side_Unit_VO=new Road_Side_Unit_VO();
	road_Side_Unit_VO.setRoadId(roadId);
	
	
	HttpSession r= request.getSession();
	
	Zone_DAO zone_DAO= new Zone_DAO();
	List ls1 =zone_DAO.load();
	r.setAttribute("zone", ls1);
	
	
	Ward_DAO ward_DAO= new Ward_DAO();
	List ls=ward_DAO.load();
	r.setAttribute("ward", ls);
	
	Area_DAO area_DAO=new Area_DAO();
	List ls2=area_DAO.load();
	r.setAttribute("area", ls2);
	
	
	Dust_DAO dust_DAO= new Dust_DAO();
	List ls4 =dust_DAO.load();
	r.setAttribute("dust", ls4);
	
	Street_DAO street_DAO=new Street_DAO();
	List ls3 =street_DAO.load();
	r.setAttribute("street", ls3);

	Road_Side_Unit_DAO road_Side_Unit_DAO=new Road_Side_Unit_DAO();
	List list =road_Side_Unit_DAO.edit(road_Side_Unit_VO);
	r.setAttribute("edit_road_side_unit", list);
	
	
	
	response.sendRedirect("admin/edit_road_side_unit.jsp");
}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("^_^");
		double longi =Double.parseDouble(request.getParameter("longi"));
		double lati =Double.parseDouble(request.getParameter("lati"));
		
		
		
		
		System.out.println("11111111111");
		int ld=Integer.parseInt(request.getParameter("id"));
		int pd=Integer.parseInt(request.getParameter("zone_id"));
		int ed=Integer.parseInt(request.getParameter("ward_id"));
		int kd=Integer.parseInt(request.getParameter("area_id"));
		int cd=Integer.parseInt(request.getParameter("dustbin_id"));
		int sd=Integer.parseInt(request.getParameter("street_id"));
		
		System.out.println("Data:"+longi +""+ lati+""+ed+pd+ld+kd+cd+sd);
		System.out.println("11111111111");
		
		Dust_VO dust_VO=new Dust_VO();
		Zone_VO zone_VO=new Zone_VO();
		Ward_VO ward_VO=new Ward_VO();
		Area_VO area_VO=new Area_VO();
		Street_VO street_VO=new Street_VO();
		Road_Side_Unit_VO road_Side_Unit_VO=new Road_Side_Unit_VO();
		
		road_Side_Unit_VO.setLongi(longi);
		road_Side_Unit_VO.setLati(lati);
		road_Side_Unit_VO.setRoadId(ld);
		
		zone_VO.setZoneId(pd);
		ward_VO.setWardId(ed);
		area_VO.setAreaId(kd);
		dust_VO.setDustId(cd);
		street_VO.setStreetId(sd);
		
		road_Side_Unit_VO.setMc(zone_VO);
		road_Side_Unit_VO.setJh(ward_VO);
		road_Side_Unit_VO.setLm(area_VO);
		road_Side_Unit_VO.setSt(street_VO);
		road_Side_Unit_VO.setDt(dust_VO);
		
		
		Road_Side_Unit_DAO road_Side_Unit_DAO=new Road_Side_Unit_DAO();
		road_Side_Unit_DAO.update(road_Side_Unit_VO);		
		search(request,response);
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		System.out.println("delete");
		int roadId =Integer.parseInt(request.getParameter("id"));
		System.out.println(roadId);
		Road_Side_Unit_VO road_Side_Unit_VO=new Road_Side_Unit_VO();
		road_Side_Unit_VO.setRoadId(roadId);
		
		Road_Side_Unit_DAO road_Side_Unit_DAO=new Road_Side_Unit_DAO();
		road_Side_Unit_DAO.delete(road_Side_Unit_VO);
		
		
		search(request, response);
	}

}
