package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Category_DAO;
import DAO.Noti_DAO;
import VO.Noti_VO;

/**
 * Servlet implementation class Noti_Controller
 */
@WebServlet("/Noti_Controller")
public class Noti_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Noti_Controller() {
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
		
		if(flag.equals("search2"))
		{
			search2(request,response);
		}
		if(flag.equals("search3"))
		{
			search3(request,response);
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
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	String module =request.getParameter("to");
	String notiDes = request.getParameter("noti_Des");
	System.out.println(module + notiDes);
	
	Noti_VO noti_VO=new Noti_VO();
	noti_VO.setModule(module);
	noti_VO.setNotiDes(notiDes);
	
	Noti_DAO noti_DAO=new Noti_DAO();
	noti_DAO.insert(noti_VO);
	
	response.sendRedirect("admin/notification.jsp");
	
	}
protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Noti_DAO noti_DAO=new Noti_DAO();
	
		
		noti_DAO.search();
		List list =noti_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("notification", list);
		response.sendRedirect("admin/search_notification.jsp");
		
		
		
}
protected void search2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	Noti_DAO noti_DAO=new Noti_DAO();

	
	noti_DAO.search();
	List list =noti_DAO.search();
	HttpSession r= request.getSession();
	r.setAttribute("notification", list);
	response.sendRedirect("user/U_News_Events.jsp");
	
	
	
}
protected void search3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	Noti_DAO noti_DAO=new Noti_DAO();

	
	noti_DAO.search();
	List list =noti_DAO.search();
	HttpSession r= request.getSession();
	r.setAttribute("notification", list);
	response.sendRedirect("admin/search_notification2.jsp");
	
	
	
}

}
