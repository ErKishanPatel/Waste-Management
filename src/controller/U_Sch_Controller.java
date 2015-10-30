package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.Schedule_VO;
import VO.Street_VO;
import VO.U_Sch_VO;
import DAO.Schedule_DAO;
import DAO.Street_DAO;

/**
 * Servlet implementation class U_Sch_Controller
 */
@WebServlet("/U_Sch_Controller")
public class U_Sch_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_Sch_Controller() {
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
		if(flag.equals("search"))
		{
			search(request,response);
		}
	}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 	
			System.out.println("hiii");
			Street_DAO street_DAO = new Street_DAO();			
			List ls =street_DAO.load();
			HttpSession r= request.getSession();
			r.setAttribute("street",ls);
		
			response.sendRedirect("user/u_sch.jsp");
						
		}

	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 	
		System.out.println("HiiiiiHello");
		int steeID=Integer.parseInt(request.getParameter("street"));
		/*Street_VO street_VO= new Street_VO();
		street_VO.setStreetId(streetId);
		*/
		
		Street_VO st=new Street_VO();
		st.setStreetId(steeID);
		Schedule_VO schedule_VO = new Schedule_VO();
		schedule_VO.setMc(st);
		
		
		
		Schedule_DAO schedule_DAO = new Schedule_DAO();
		List l= schedule_DAO.search(schedule_VO);
		
		HttpSession r= request.getSession();
		r.setAttribute("checkstreet",l);
		
		List l2 = schedule_DAO.search2();
		r.setAttribute("search",l2);
			
	
		response.sendRedirect("user/u_schedule.jsp");
						
		}
}
