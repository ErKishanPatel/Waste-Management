package controller;


import VO.Schedule_VO;
import DAO.Schedule_DAO;
import DAO.Street_DAO;

import VO.Street_VO;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Schedule_Controller
 */
@WebServlet("/Schedule_Controller")
public class Schedule_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Schedule_Controller() {
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
		String scheduleName =request.getParameter("schedule");
		String scheduleDes =request.getParameter("schedule_des");
		System.out.println(scheduleDes + scheduleName);
		System.out.println("11111111111");
		Schedule_VO schedule_VO=new Schedule_VO();
		schedule_VO.setScheduleName(scheduleName);
		schedule_VO.setScheduleDes(scheduleDes);
	
		
		int i = Integer.parseInt(request.getParameter("street_id"));
        
		
		Street_VO street_VO = new Street_VO();
		 street_VO.setStreetId(i);
	     schedule_VO.setMc(street_VO);
		
		
		Schedule_DAO schedule_DAO=new Schedule_DAO();
		schedule_DAO.insert(schedule_VO);
		search(request,response);
		
		
}
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			Street_DAO l= new Street_DAO();
			List<?> ls =l.load();
			
			HttpSession r= request.getSession();
			r.setAttribute("street", ls);
			
			response.sendRedirect("admin/manage_schedule.jsp");
			
			
			
		}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		

		Schedule_DAO schedule_DAO=new Schedule_DAO();
		
		schedule_DAO.search();

	
	List<?> list =schedule_DAO.search();
	HttpSession r= request.getSession();
	r.setAttribute("schedule", list);
	response.sendRedirect("admin/search_schedule.jsp");	
}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		int scheduleId =Integer.parseInt(request.getParameter("id"));		
		Schedule_VO schedule_VO=new Schedule_VO();
		schedule_VO.setScheduleId(scheduleId);
		
		HttpSession r= request.getSession();
		
		Street_DAO street_DAO = new Street_DAO();
		List<?> ls =street_DAO.load();
		r.setAttribute("street", ls);
		
		Schedule_DAO schedule_DAO=new Schedule_DAO();
		List<?> list =schedule_DAO.edit(schedule_VO);
		r.setAttribute("editschedule", list);		
		response.sendRedirect("admin/editschedule.jsp");
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("^_^");
	
		String scheduleName =request.getParameter("schedule");
		int ld=Integer.parseInt(request.getParameter("id"));
		int pd=Integer.parseInt(request.getParameter("street_id"));
	
		System.out.println("Data:"+ scheduleName+""+ld+pd);
			
		Street_VO street_VO=new Street_VO();
		Schedule_VO schedule_VO=new Schedule_VO();
		
		schedule_VO.setScheduleName(scheduleName);
		schedule_VO.setScheduleId(ld);
		
		street_VO.setStreetId(pd);
		schedule_VO.setMc(street_VO);
		
		Schedule_DAO schedule_DAO=new Schedule_DAO();
		schedule_DAO.update(schedule_VO);		
		
		search(request,response);
		
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int scheduleId =Integer.parseInt(request.getParameter("id"));
		System.out.println(scheduleId);
		Schedule_VO schedule_VO=new Schedule_VO();
		schedule_VO.setScheduleId(scheduleId);
		
		Schedule_DAO schedule_DAO=new Schedule_DAO();
		schedule_DAO.delete(schedule_VO);			
	
		search(request, response);

	}
	

	

}
