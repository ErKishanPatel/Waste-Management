package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.C_Reg_DAO;
import DAO.LoginDAO;
import DAO.U_Reg_DAO;
import VO.C_Reg_VO;
import VO.LoginVO;
import VO.U_Reg_VO;

/**
 * Servlet implementation class U_Reg_Controller
 */
@WebServlet("/U_Reg_Controller")
public class U_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Reg_Controller() {
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
		if(flag.equals("delete"))
		{
			delete(request,response);
		}
		else if(flag.equals("validate"))
		{
			validateUserName(request,response);
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
		System.out.println("Hello");
		String fname =request.getParameter("fname");
		String lname =request.getParameter("lname");
		String ad =request.getParameter("ad");
		String city =request.getParameter("city");	
		
		long c_no= Long.parseLong(request.getParameter("c_no"));
		
		
		String email =request.getParameter("userName");
		String password =request.getParameter("userPassword");		
	
		System.out.println(fname +lname+ ad + city + email+ password  );
		
		LoginVO loginVO = new LoginVO();		
		loginVO.setUserName(email);
		loginVO.setUserPassword(password);
		loginVO.setUserType("user");
	
		LoginDAO loginDAO=new LoginDAO();
		loginDAO.insert(loginVO);
		
		U_Reg_VO u_Reg_VO = new U_Reg_VO();
		u_Reg_VO.setFname(fname);
		u_Reg_VO.setLname(lname);		
		u_Reg_VO.setAd(ad);
		u_Reg_VO.setCity(city);	
		u_Reg_VO.setC_no(c_no);		
		u_Reg_VO.setLogin(loginVO);
		
		
		U_Reg_DAO u_Reg_DAO= new U_Reg_DAO();
		u_Reg_DAO.insert(u_Reg_VO);
		
		response.sendRedirect("login.jsp");
		
	
		
		
}

	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Search-Flag");
		U_Reg_DAO u_Reg_DAO = new U_Reg_DAO();
		u_Reg_DAO.search();
		List<?> list =u_Reg_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("user", list);
		
		
		try {
			response.sendRedirect("admin/search_user.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int uId =Integer.parseInt(request.getParameter("uId"));
		System.out.println(uId);
		
		U_Reg_VO u_Reg_VO = new U_Reg_VO();
		u_Reg_VO.setuId(uId);
	
		U_Reg_DAO u_Reg_DAO = new U_Reg_DAO();
		u_Reg_DAO.delete(u_Reg_VO);		
			
		//search(request, response);

	}
protected void validateUserName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		
		if(userName != null)
		{	
			LoginVO loginVO = new LoginVO();		
			loginVO.setUserName(userName);
			U_Reg_VO u_Reg_VO = new U_Reg_VO();
			u_Reg_VO.setLogin(loginVO);
			
			U_Reg_DAO u_Reg_DAO = new U_Reg_DAO();		
			List list=u_Reg_DAO.validateUserName(u_Reg_VO);
			
			HttpSession session=request.getSession();
			
			if(list.size() >= 1)
			{
				session.setAttribute("returnFlag", "false");
			}
			else
			{
				session.setAttribute("returnFlag", "true");
			}
		
			response.sendRedirect("loadReturnFlag.jsp");
		}

}
}
