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
import VO.C_Reg_VO;
import VO.LoginVO;
import DAO.LoginDAO;


/**
 * Servlet implementation class C_Reg_Controller
 */
@WebServlet("/C_Reg_Controller")
public class C_Reg_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_Reg_Controller() {
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

	private void search(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		C_Reg_DAO c_Reg_DAO= new C_Reg_DAO();
		c_Reg_DAO.search();		
		List<?> list =c_Reg_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("company", list);
		try {
			response.sendRedirect("admin/search_company.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		String companyName =request.getParameter("c_name");
		String ad =request.getParameter("add");
		String city =request.getParameter("city");
		
		int pin =Integer.parseInt(request.getParameter("pin"));
		int c_contact =Integer.parseInt(request.getParameter("c_contact"));
		int p_contact =Integer.parseInt(request.getParameter("p_contact"));	
		String email =request.getParameter("userName");
		String password =request.getParameter("userPassword");
		
		String reg_no =request.getParameter("reg_no");
		
		
		
	
		System.out.println(companyName + ad + city + pin + c_contact + p_contact + email+ password  + reg_no);
		
		LoginVO loginVO = new LoginVO();
	
		
		loginVO.setUserName(email);
		loginVO.setUserPassword(password);
		loginVO.setUserType("company");
	
		LoginDAO loginDAO=new LoginDAO();
		loginDAO.insert(loginVO);
		
		C_Reg_VO  c_reg_VO = new C_Reg_VO();
		
		c_reg_VO.setCompanyName(companyName);
		c_reg_VO.setAd(ad);
		c_reg_VO.setCity(city);
		c_reg_VO.setPin(pin);
		c_reg_VO.setC_contact(c_contact);
		c_reg_VO.setP_contact(p_contact);
		
		c_reg_VO.setReg_no(reg_no);
		c_reg_VO.setLogin(loginVO);
		
		
	
		C_Reg_DAO  c_reg_DAO = new C_Reg_DAO();
		c_reg_DAO.insert(c_reg_VO);
		response.sendRedirect("admin/c_index.jsp");
		
	
		
		
}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{		
			LoginDAO loginDAO = new LoginDAO();			
			List<?> ls =loginDAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("login", ls);
			response.sendRedirect("admin/c_reg.jsp");
			
			
			
		}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		System.out.println("pratikkkkk");
		int i =Integer.parseInt(request.getParameter("id"));
	
		C_Reg_VO  c_reg_VO = new C_Reg_VO();	
		LoginVO loginVO = new LoginVO();
		loginVO.setUserId(i);
		c_reg_VO.setLogin(loginVO);
		
		C_Reg_DAO  c_reg_DAO = new C_Reg_DAO();
			
		List l;
		l=c_reg_DAO.edit(c_reg_VO);
		
		
		
		HttpSession r= request.getSession();
		
		r.setAttribute("login", l);
		response.sendRedirect("admin/editcompany2.jsp");
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String companyName =request.getParameter("c_name");
		String add =request.getParameter("add");
		String city =request.getParameter("city");
		int pin =Integer.parseInt(request.getParameter("pin"));
		int c_contact =Integer.parseInt(request.getParameter("c_contact"));
		int p_contact =Integer.parseInt(request.getParameter("p_contact"));
		/*String email =request.getParameter("userName");
		String password =request.getParameter("userPassword");
		*/
		String reg_no =request.getParameter("reg_no");
		
		int ed=Integer.parseInt(request.getParameter("id"));
		HttpSession r= request.getSession();
		int pd=(Integer)r.getAttribute("userID");
		LoginVO lv=new LoginVO();
		lv.setUserId(pd);
		
		System.out.println("11111111111");
		

		C_Reg_VO  c_reg_VO = new C_Reg_VO();
		/*LoginVO loginVO = new LoginVO();*/
		
		
		c_reg_VO.setCompanyName(companyName);
		c_reg_VO.setAd(add);
		c_reg_VO.setCity(city);
		c_reg_VO.setC_contact(c_contact);
		c_reg_VO.setP_contact(p_contact);
		c_reg_VO.setPin(pin);
		c_reg_VO.setReg_no(reg_no);
		c_reg_VO.setLogin(lv);
		c_reg_VO.setCompanyId(ed);
	
		/*loginVO.setUserName(email);
		loginVO.setUserPassword(password);
		*/
		
		C_Reg_DAO c_Reg_DAO = new C_Reg_DAO();
		c_Reg_DAO.update(c_reg_VO);
		response.sendRedirect("admin/c_index.jsp");
		
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int companyId =Integer.parseInt(request.getParameter("id"));
		System.out.println(companyId);
		
		C_Reg_VO c_Reg_VO = new C_Reg_VO();
		c_Reg_VO.setCompanyId(companyId);
		
		C_Reg_DAO c_Reg_DAO = new C_Reg_DAO();		
		c_Reg_DAO.delete(c_Reg_VO);
		
			
		search(request, response);

	}


}
