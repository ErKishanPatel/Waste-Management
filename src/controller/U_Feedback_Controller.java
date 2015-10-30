package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.U_Complaint_DAO;
import DAO.U_Feedback_DAO;
import VO.U_Complaint_VO;
import VO.U_Feedback_VO;

/**
 * Servlet implementation class U_Feedback_Controller
 */
@WebServlet("/U_Feedback_Controller")
public class U_Feedback_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Feedback_Controller() {
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
		String email =request.getParameter("email");
		String name =request.getParameter("name");
		String des =request.getParameter("des");
		System.out.println(email +name + des);
		
		U_Feedback_VO u_Feedback_VO = new U_Feedback_VO();
		u_Feedback_VO.setEmail(email);
		u_Feedback_VO.setName(name);
		u_Feedback_VO.setDes(des);
		
		U_Feedback_DAO u_Feedback_DAO = new U_Feedback_DAO();
		u_Feedback_DAO.insert(u_Feedback_VO);
		response.sendRedirect("user/feedback.jsp");
		
}
	protected void search(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		U_Feedback_DAO u_Feedback_DAO = new U_Feedback_DAO();
		u_Feedback_DAO.search();
		

		List list = u_Feedback_DAO.search();
		HttpSession r = request.getSession();
		r.setAttribute("feedback", list);
		response.sendRedirect("admin/view_feedback.jsp");

	}

}
