
package controller;

import java.io.IOException;
import java.util.List;
import java.lang.Long;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;
import DAO.S_Reg_DAO;
import VO.LoginVO;
import VO.S_Reg_VO;

/**
 * Servlet implementation class S_Reg_Controller
 */
@WebServlet("/S_Reg_Controller")
public class S_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S_Reg_Controller() {
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
		if(flag.equals("edit"))
		{
			edit(request,response);
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
		String deptName =request.getParameter("deptName");
		String post =request.getParameter("post");
		String e_name =request.getParameter("e_name");
		String ad =request.getParameter("ad");
		System.out.println("Heyy");
		long c_contact= Long.parseLong(request.getParameter("c_contact"));
					
		String email =request.getParameter("userName");
		String password =request.getParameter("userPassword");	
		String reg_no =request.getParameter("reg_no");
		
		
		
	
		System.out.println(deptName + ad + post  + c_contact  + email+ password  + reg_no);
		
		LoginVO loginVO = new LoginVO();
	
		
		loginVO.setUserName(email);
		loginVO.setUserPassword(password);
		loginVO.setUserType("govt_staff");
	
		LoginDAO loginDAO=new LoginDAO();
		loginDAO.insert(loginVO);
		
		S_Reg_VO s_reg_VO = new S_Reg_VO();
		
		s_reg_VO.setDeptName(deptName);
		s_reg_VO.setPost(post);
		s_reg_VO.setE_name(e_name);
		s_reg_VO.setAd(ad);		
		s_reg_VO.setC_contact(c_contact);		
		s_reg_VO.setReg_no(reg_no);
		s_reg_VO.setLogin(loginVO);	
		System.out.println("Heyyy");
		S_Reg_DAO s_Reg_DAO = new S_Reg_DAO();		
		s_Reg_DAO.insert(s_reg_VO);	
		search(request,response);
		
}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		int govt_staffId =Integer.parseInt(request.getParameter("id"));
		S_Reg_VO s_reg_VO=new S_Reg_VO();
		s_reg_VO.setGovt_staffId(govt_staffId);
		
		S_Reg_DAO s_Reg_DAO = new S_Reg_DAO();		
		
		List list= s_Reg_DAO.edit(s_reg_VO);
		
		
		System.out.print("edit size is"+list.size());
		HttpSession r= request.getSession();
		r.setAttribute("ed", list);
		response.sendRedirect("admin/editgovtstaff.jsp");
	}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			LoginDAO l= new LoginDAO();
			List ls=l.load();
		
			HttpSession r= request.getSession();
			r.setAttribute("loadlogin", ls);
			response.sendRedirect("admin/search_govt_staff.jsp");				
			
		}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("Update Method");
		int ed=Integer.parseInt(request.getParameter("id"));
		
		String deptName =request.getParameter("deptName");
		String post =request.getParameter("post");
		String e_name =request.getParameter("e_name");
		String ad =request.getParameter("ad");
		long c_contact= Long.parseLong(request.getParameter("c_contact"));		
		String email =request.getParameter("userName");
		String password =request.getParameter("userPassword");	
		String reg_no =request.getParameter("reg_no");
		System.out.println(deptName + ad + post  + c_contact  + email+ password  + reg_no);
		LoginVO loginVO = new LoginVO();
         S_Reg_VO s_reg_VO = new S_Reg_VO();
         loginVO.setUserName(email);
		s_reg_VO.setDeptName(deptName);
		s_reg_VO.setPost(post);
		s_reg_VO.setE_name(e_name);
		s_reg_VO.setAd(ad);		
		s_reg_VO.setC_contact(c_contact);		
		s_reg_VO.setReg_no(reg_no);
		s_reg_VO.setGovt_staffId(ed);
		System.out.println("Heyyy");
	    S_Reg_DAO s_Reg_DAO=new S_Reg_DAO();
		s_Reg_DAO.update(s_reg_VO);
		//response.sendRedirect("admin/search_category.jsp");
		search(request, response);
		
	}
	private void search(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		S_Reg_DAO s_Reg_DAO = new S_Reg_DAO();		
		s_Reg_DAO.search();		
		List<?> list =s_Reg_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("govt_staff", list);
		try {
			response.sendRedirect("admin/search_govt_staff.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int govt_staffId =Integer.parseInt(request.getParameter("id"));
		System.out.println(govt_staffId);
		
		S_Reg_VO s_reg_VO = new S_Reg_VO();
		s_reg_VO.setGovt_staffId(govt_staffId);
		
		S_Reg_DAO s_Reg_DAO = new S_Reg_DAO();
		s_Reg_DAO.delete(s_reg_VO);
					
		search(request, response);

	}

}
