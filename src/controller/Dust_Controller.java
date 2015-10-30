package controller;
import VO.Dust_VO;
import DAO.Dust_DAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dust_Controller
 */
@WebServlet("/Dust_Controller")
public class Dust_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dust_Controller() {
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
		String dustNo =request.getParameter("dust");
		String dustName =request.getParameter("dust_des");
		System.out.println(dustNo + dustName);
		System.out.println("11111111111");
		
		Dust_VO dust_VO=new Dust_VO();
		dust_VO.setDustNo(dustNo);
		dust_VO.setDustName(dustName);
		
		Dust_DAO dust_DAO=new Dust_DAO();
		dust_DAO.insert(dust_VO);
		search(request,response);
		
		
}

protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Dust_DAO dust_DAO=new Dust_DAO();
		
		dust_DAO.search();
		List<?> list =dust_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("dust", list);
		response.sendRedirect("admin/view_dustbin.jsp");
		
		
		
}

protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		int dustId =Integer.parseInt(request.getParameter("id"));
		Dust_VO dust_VO=new Dust_VO();
		dust_VO.setDustId(dustId);
		
		Dust_DAO dust_DAO=new Dust_DAO();		
		
		List<?> list =dust_DAO.edit(dust_VO);
		
		HttpSession r= request.getSession();
		r.setAttribute("editdustbin", list);
		response.sendRedirect("admin/editdustbin.jsp");
}
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	System.out.println("in edit");
	String dustNo =request.getParameter("dust");
	String dustName =request.getParameter("dust_des");
	int ed=Integer.parseInt(request.getParameter("id"));
	System.out.println("Data:"+dustNo +""+ dustName+""+ed);
	
	Dust_VO dust_VO=new Dust_VO();
	dust_VO.setDustNo(dustNo);
	dust_VO.setDustName(dustName);
	dust_VO.setDustId(ed);
	
	Dust_DAO dust_DAO=new Dust_DAO();
	dust_DAO.update(dust_VO);
	search(request,response);
	
	
}
protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	
	int dustId =Integer.parseInt(request.getParameter("id"));
	System.out.println(dustId);
	Dust_VO dust_VO=new Dust_VO();
	dust_VO.setDustId(dustId);
	
	Dust_DAO dust_DAO=new Dust_DAO();
	dust_DAO.delete(dust_VO);			

	search(request, response);

}	
}
