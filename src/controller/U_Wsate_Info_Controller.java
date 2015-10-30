package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Area_DAO;
import DAO.AttachmentMappingDAO;
import DAO.U_Complaint_DAO;
import DAO.U_Waste_Info_DAO;
import VO.Area_VO;
import VO.AttachmentMappingVO;
import VO.U_Complaint_VO;
import VO.U_Waste_Info_VO;

/**
 * Servlet implementation class U_Wsate_Info_Controller
 */
@WebServlet("/U_Wsate_Info_Controller")
public class U_Wsate_Info_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Wsate_Info_Controller() {
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
		String wasteInfo =request.getParameter("w_info");
		String wasteDes =request.getParameter("des");
		int j = Integer.parseInt(request.getParameter("area"));
		System.out.println(wasteInfo + wasteDes);
		
		
		
		Area_VO area_VO=new Area_VO();
		area_VO.setAreaId(j);
		
		
		
		
		U_Waste_Info_VO u_Waste_Info_VO=new U_Waste_Info_VO();
		u_Waste_Info_VO.setWasteInfo(wasteInfo);
		u_Waste_Info_VO.setWasteDes(wasteDes);
		u_Waste_Info_VO.setAr(area_VO);

		
		U_Waste_Info_DAO u_Waste_Info_DAO=new U_Waste_Info_DAO();
		u_Waste_Info_DAO.insert(u_Waste_Info_VO);
		
		
		AttachmentMappingVO attachMPGVO = new AttachmentMappingVO();
		attachMPGVO.setU_waste(u_Waste_Info_VO);
		
		AttachmentMappingDAO attachMPG_DAO= new AttachmentMappingDAO();
		
		
		//getting file from Session
		
		HttpSession session =request.getSession();
		
		List<?> myList=(List<?>)session.getAttribute("fileList");
		System.out.println("khushbu");
		
		Iterator<?> itr =  myList.iterator();
		 System.out.println("khushbu");
         System.out.println("Reading for session");
         int i =0;
         while (itr.hasNext()) {
     
        	 attachMPGVO.setAttachmentName("Photo"+i);
        	 attachMPGVO.setPath((String)itr.next());
        	 
        	 attachMPG_DAO.insert(attachMPGVO);
        	 
        	 i++;
			}
		

		
		session.removeAttribute("fileList");
			
			response.sendRedirect("user/u_index.jsp");
		
		
}
	
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Area_DAO area_DAO = new Area_DAO();
			List ls =area_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("area", ls);
		
			response.sendRedirect("user/post_waste_info.jsp");
						
		}

	
}
