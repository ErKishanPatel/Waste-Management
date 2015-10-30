package controller;
import VO.Category_VO;
import VO.Subcat_VO;
import DAO.Category_DAO;
import DAO.Subcat_DAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.ArrayList;






/**
 * Servlet implementation class Subcat_Controller
 */
@WebServlet("/Subcat_Controller")
public class Subcat_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subcat_Controller() {
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
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String subcatName =request.getParameter("subcat");
		String subcatDes =request.getParameter("subcat_des");
		System.out.println(subcatDes + subcatName);
		int i = Integer.parseInt(request.getParameter("categoryId"));
		
		Category_VO category_VO = new Category_VO();
		category_VO.setCategoryId(i);
		
		Subcat_VO subcat_VO=new Subcat_VO();
		subcat_VO.setSubcatName(subcatName);
		subcat_VO.setSubcatDes(subcatDes);
		subcat_VO.setMc(category_VO);
		
		Subcat_DAO subcat_DAO=new Subcat_DAO();
		subcat_DAO.insert(subcat_VO);
		search(request, response);
		
}
	
protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		Category_DAO l= new Category_DAO();
		List<?> ls =l.load();
		HttpSession r= request.getSession();
		r.setAttribute("category", ls);
		response.sendRedirect("admin/manage_subcategory.jsp");
		
		
		
	}
protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	Subcat_DAO subcat_DAO=new Subcat_DAO();	
	subcat_DAO.search();
	List<?> list =subcat_DAO.search();
	HttpSession r= request.getSession();
	r.setAttribute("subcategory", list);
	response.sendRedirect("admin/search_subcategory.jsp");
	
	
	
}
protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
	
	int subcatId =Integer.parseInt(request.getParameter("id"));
	Subcat_VO subcat_VO=new Subcat_VO();
	subcat_VO.setSubcatId(subcatId);
	
	Subcat_DAO subcat_DAO=new Subcat_DAO();
	Category_DAO l= new Category_DAO();
	List<?> ls =l.load();
	
	List<?> list =subcat_DAO.edit(subcat_VO);
	System.out.print("edit size is"+list.size());
	HttpSession r= request.getSession();
	r.setAttribute("editsubcat", list);
	r.setAttribute("category", ls);
	response.sendRedirect("admin/editsubcat.jsp");
}

protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	System.out.println("11111111111");
	String subcatName =request.getParameter("subcat");
	String subcatDes =request.getParameter("subcat_des");
	int ed=Integer.parseInt(request.getParameter("id"));
	int pd=Integer.parseInt(request.getParameter("cat_id"));
	System.out.println("Data:"+subcatDes +""+ subcatName+""+ed+pd);
	//System.out.println("11111111111");
	

	Category_VO category_VO=new Category_VO();
	Subcat_VO subcat_VO=new Subcat_VO();
	subcat_VO.setSubcatName(subcatName);
	subcat_VO.setSubcatDes(subcatDes);
	subcat_VO.setSubcatId(ed);
	category_VO.setCategoryId(pd);	
	subcat_VO.setMc(category_VO);
	
	Subcat_DAO subcat_DAO=new Subcat_DAO();
	subcat_DAO.update(subcat_VO);
	search(request, response);
	
}
protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	
	int subcatId =Integer.parseInt(request.getParameter("id"));
	System.out.println(subcatId);
	Subcat_VO subcat_VO=new Subcat_VO();
	subcat_VO.setSubcatId(subcatId);
	
	Subcat_DAO subcat_DAO=new Subcat_DAO();
	subcat_DAO.delete(subcat_VO);
		
	search(request, response);

}
}
