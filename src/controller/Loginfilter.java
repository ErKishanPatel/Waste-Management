package controller;

import java.util.Iterator;
import java.util.List;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Area_DAO;
import DAO.LoginDAO;
import DAO.U_Complaint_DAO;
import DAO.U_Garbage_allocate_DAO;
import VO.LoginVO;
import VO.U_Complaint_VO;

/**
 * Servlet Filter implementation class Loginfilter
 */
@WebFilter("/*")	
public class Loginfilter implements Filter {

	/**
	 * Default constructor.
	 */
	public Loginfilter() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)'
	 * 
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String uri = ((HttpServletRequest) request).getRequestURI();
		HttpSession session = ((HttpServletRequest) request).getSession();
		RequestDispatcher requestDispatcher;
		//String logout = request.getParameter("logout");
		String flag = request.getParameter("flag");
		
		System.out.println("falg = " + flag);
		
		
		if (uri.contains("login") || uri.contains("/css")
				|| uri.contains("/js")
				||uri.contains("user/images")|| uri.contains("/img") || uri.contains("/fonts")||uri.contains("/admin/editcompany2.jsp")||uri.contains("/admin/notification2.jsp")||uri.contains("loadReturnFlag.jsp")|| uri.contains("resetpwd.jsp") || uri.contains("/font") || uri.contains("c_reg.jsp")||uri.contains("/user/u_reg.jsp")||uri.contains("/user/feedback.jsp")||uri.contains("/user/faq.jsp")||uri.contains("/user/u_progress.jsp")||uri.contains("/user/u_progress2.jsp")||uri.contains("/user/u_index.jsp")||uri.contains("/user/u_sch.jsp")||uri.contains("/user/u_schedule.jsp")||uri.contains("fileupload.jsp")|| uri.contains("Controller")
				) {
			
			
			System.out.println("inside reg");

			// requestDispatcher =
			// request.getRequestDispatcher("/user/register.jsp");
			// requestDispatcher.forward(request,response);

			chain.doFilter(request, response);

		}
		
		else if (flag != null && flag.equals("logout")) {
			// session.removeAttribute("userID");
			System.out.println("logout in else if");

			session.invalidate();
			System.out.println("after session invalidates");
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);

		}
		
		else if (request.getParameter("flag") != null
				&& request.getParameter("flag").equals("login")) {

			
			Area_DAO area_DAO=new Area_DAO();			
			area_DAO.search();
			List list1 =area_DAO.search();
			HttpSession r= ((HttpServletRequest) request).getSession();
			r.setAttribute("area", list1);
			

			
			
			
			String userName = request.getParameter("userName");
			String userPassword = request.getParameter("userPassword");
			System.out.println(userName + "" + userPassword);

			LoginVO loginVO = new LoginVO();
			loginVO.setUserName(userName);
			loginVO.setUserPassword(userPassword);

			LoginDAO loginDAO = new LoginDAO();
			List list = loginDAO.authentication(loginVO);

			if (list != null && list.size() >= 1) {

				Iterator itr = list.iterator();

				// while(itr.hasNext()){
				LoginVO user = (LoginVO) itr.next();

				int y = (Integer) user.getUserId();
				session.setAttribute("userID", y);

				System.out.println(user.getUserType());
				// System.out.println(session.getAttribute("userId"));
				String type = user.getUserType();
				session.setAttribute("usertype", type);
				System.out.println(y);

				if (type.equals("admin")) {
					U_Complaint_VO uv=new U_Complaint_VO();
					U_Complaint_DAO ud=new U_Complaint_DAO();
					List ls=ud.search();
					
					U_Garbage_allocate_DAO udao = new U_Garbage_allocate_DAO();
					List lsChart = udao.chartData();
					
					session.setAttribute("complain",ls);
					session.setAttribute("complain_size",ls.size());
					session.setAttribute("chartData",lsChart);
					requestDispatcher = request
							.getRequestDispatcher("/admin/index.jsp");
					requestDispatcher.forward(request, response);
				} else if (type.equals("Govt_staff")) {
					
					U_Complaint_VO uv=new U_Complaint_VO();
					U_Complaint_DAO ud=new U_Complaint_DAO();
					List ls=ud.search();
					session.setAttribute("complain",ls);
					session.setAttribute("complain_size",ls.size());
					
					requestDispatcher = request
							.getRequestDispatcher("/admin/s_index.jsp");
					requestDispatcher.forward(request, response);
				}

				else if (type.equals("company"))

				{
					U_Complaint_VO uv=new U_Complaint_VO();
					U_Complaint_DAO ud=new U_Complaint_DAO();
					List ls=ud.search();
					session.setAttribute("complain",ls);
					session.setAttribute("complain_size",ls.size());
					
					requestDispatcher = request.getRequestDispatcher("/admin/c_index.jsp");
					requestDispatcher.forward(request, response);
				}
				else if (type.equals("user"))

				{
					((HttpServletResponse)response).sendRedirect("user/u_index.jsp");
					
					/*requestDispatcher = request
							.getRequestDispatcher("/user/u_index.jsp");
					requestDispatcher.forward(request, response);*/
				}
				
			}

		}

		else if (session.getAttribute("userID") != null) {
			String h = (String) session.getAttribute("usertype");
			System.out.println("type = = = " + h);

			if (h != null && h.equals("admin")) {

				System.out.println("chain");
				chain.doFilter(request, response);
			}

			else if (h != 	null && h.equals("Govt_staff")) {
				System.out.println("chain");
				/*RequestDispatcher rd = request
						.getRequestDispatcher("/admin/s_index.jsp");
				rd.forward(request, response);*/
				chain.doFilter(request, response);
			}

			else if (h != null && h.equals("company")) {
				System.out.println("chain");
				/*RequestDispatcher rd = request
						.getRequestDispatcher("/admin/s_index.jsp");
				rd.forward(request, response);*/
				chain.doFilter(request, response);
			}

			else {
				System.out.println("chain");
				/*RequestDispatcher rd = request
						.getRequestDispatcher("/admin/s_index.jsp");
				rd.forward(request, response);*/
				chain.doFilter(request, response);
			}
		} else {

			RequestDispatcher rd = request
					.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);

		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
