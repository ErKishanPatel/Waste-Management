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
import DAO.U_Complaint_DAO;
import VO.Category_VO;
import VO.LoginVO;
import VO.U_Complaint_VO;

/**
 * Servlet implementation class U_Complaint_Controller
 */
@WebServlet("/U_Complaint_Controller")
public class U_Complaint_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public U_Complaint_Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		System.out.println(flag);

		if (flag.equals("search")) {
			search(request, response);
		}
		if (flag.equals("search2")) {
			search2(request, response);
		}
		if (flag.equals("search3")) {
			search3(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		System.out.println(flag);
		if (flag.equals("insert")) {
			insert(request, response);
		}
	}

	protected void insert(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String complaint = request.getParameter("comp");
		String complaintDes = request.getParameter("comp_des");

		HttpSession r = request.getSession();
		int i = (Integer) r.getAttribute("userID");

		System.out.println(complaint + complaintDes);

		U_Complaint_VO u_Complaint_VO = new U_Complaint_VO();
		LoginVO l = new LoginVO();
		l.setUserId(i);
		u_Complaint_VO.setComplaint(complaint);
		u_Complaint_VO.setComplaintDes(complaintDes);
		u_Complaint_VO.setLogin(l);

		U_Complaint_DAO u_Complaint_DAO = new U_Complaint_DAO();
		u_Complaint_DAO.insert(u_Complaint_VO);
		response.sendRedirect("user/post_complain.jsp");

	}

	protected void search(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		U_Complaint_DAO u_Complaint_DAO = new U_Complaint_DAO();
		u_Complaint_DAO.search();

		List list = u_Complaint_DAO.search();
		HttpSession r = request.getSession();
		r.setAttribute("complaint", list);
		response.sendRedirect("admin/search_complaint.jsp");

	}

	protected void search2(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		U_Complaint_DAO u_Complaint_DAO = new U_Complaint_DAO();
		u_Complaint_DAO.search();
		List list = u_Complaint_DAO.search();
		HttpSession r = request.getSession();
		r.setAttribute("complaint", list);
		response.sendRedirect("admin/search_complaint2.jsp");

	}

	protected void search3(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		U_Complaint_DAO u_Complaint_DAO = new U_Complaint_DAO();
		u_Complaint_DAO.search();
		List list = u_Complaint_DAO.search();
		HttpSession r = request.getSession();
		r.setAttribute("complaint", list);
		response.sendRedirect("admin/search_complaint3.jsp");


}
}