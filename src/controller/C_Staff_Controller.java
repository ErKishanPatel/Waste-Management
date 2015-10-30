package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.C_Staff_DAO;
import DAO.Subcat_DAO;
import DAO.Zone_DAO;
import VO.C_Staff_VO;
import VO.Subcat_VO;
import VO.Zone_VO;

/**
 * Servlet implementation class C_Staff_Controller
 */
@WebServlet("/C_Staff_Controller")
public class C_Staff_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_Staff_Controller() {
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

		System.out.println("Hello");
		String staffName =request.getParameter("staffName");
		String ad =request.getParameter("ad");
		String city =request.getParameter("city");		
		int pin =Integer.parseInt(request.getParameter("pin"));
		int contact =Integer.parseInt(request.getParameter("contact"));		
		String reg_no =request.getParameter("reg_no");
		System.out.println(staffName + ad + city + pin + contact + reg_no);
		
		C_Staff_VO c_Staff_VO = new C_Staff_VO();
		c_Staff_VO.setStaffName(staffName);
		c_Staff_VO.setAd(ad);
		c_Staff_VO.setCity(city);
		c_Staff_VO.setPin(pin);
		c_Staff_VO.setContact(contact);
		c_Staff_VO.setReg_no(reg_no);
		
		C_Staff_DAO c_Staff_DAO= new C_Staff_DAO();
		c_Staff_DAO.insert(c_Staff_VO);
		search(request,response);
	

}
protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	
		C_Staff_DAO c_Staff_DAO= new C_Staff_DAO();		
		c_Staff_DAO.search();		
		List<?> list =c_Staff_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("staff", list);
		response.sendRedirect("admin/c_search_staff.jsp");
		
}
protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
	
	int staffId =Integer.parseInt(request.getParameter("id"));
	C_Staff_VO c_Staff_VO = new C_Staff_VO();
	c_Staff_VO.setStaffId(staffId);
	
	C_Staff_DAO c_Staff_DAO = new C_Staff_DAO();
	List<?> list =c_Staff_DAO.edit(c_Staff_VO);
	HttpSession r= request.getSession();
	r.setAttribute("editstaff", list);
	response.sendRedirect("admin/c_edit_staff.jsp");
}
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	System.out.println("11111111111");
	
	String staffName =request.getParameter("staffName");
	String ad =request.getParameter("ad");
	String city =request.getParameter("city");		
	int pin =Integer.parseInt(request.getParameter("pin"));
	int contact =Integer.parseInt(request.getParameter("contact"));		
	String reg_no =request.getParameter("reg_no");	
	int ed=Integer.parseInt(request.getParameter("id"));
	System.out.println(staffName + ad + city + pin + contact + reg_no);

	C_Staff_VO c_Staff_VO = new C_Staff_VO();
	c_Staff_VO.setStaffName(staffName);
	c_Staff_VO.setAd(ad);
	c_Staff_VO.setCity(city);
	c_Staff_VO.setPin(pin);
	c_Staff_VO.setContact(contact);
	c_Staff_VO.setReg_no(reg_no);
	c_Staff_VO.setStaffId(ed);
	
	C_Staff_DAO c_Staff_DAO = new C_Staff_DAO();
	c_Staff_DAO.update(c_Staff_VO);
	search(request, response);	
}
protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	
	int staffId =Integer.parseInt(request.getParameter("id"));
	System.out.println(staffId);
	C_Staff_VO c_Staff_VO = new C_Staff_VO();
	c_Staff_VO.setStaffId(staffId);
	
	C_Staff_DAO c_Staff_DAO = new C_Staff_DAO();
	c_Staff_DAO.delete(c_Staff_VO);
	search(request, response);	
	

}



}