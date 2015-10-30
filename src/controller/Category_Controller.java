package controller;

import VO.Category_VO;
import DAO.Category_DAO;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUtils;

/**
 * Servlet implementation class Category_Controller
 */
@WebServlet("/Category_Controller")
public class Category_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Category_Controller() {
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
		String categoryName =request.getParameter("cat");
		String categoryDes =request.getParameter("cat_des");
		System.out.println(categoryDes + categoryName);
		
		
		Category_VO category_VO=new Category_VO();
		category_VO.setCategoryName(categoryName);
		category_VO.setCategoryDes(categoryDes);
		
		Category_DAO category_DAO=new Category_DAO();
		category_DAO.insert(category_VO);
		search(request, response);
		
}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Category_DAO category_DAO=new Category_DAO();
		
		category_DAO.search();
		List list =category_DAO.search();
		HttpSession r= request.getSession();
		r.setAttribute("category", list);
		response.sendRedirect("admin/search_category.jsp");
		
		
		
}

protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		
		int catId =Integer.parseInt(request.getParameter("id"));
		Category_VO category_VO=new Category_VO();
		category_VO.setCategoryId(catId);
		
		Category_DAO category_DAO=new Category_DAO();		
		
		List list =category_DAO.edit(category_VO);
		
		HttpSession r= request.getSession();
		r.setAttribute("editcat", list);
		response.sendRedirect("admin/editcat.jsp");
}
protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	
	String categoryName =request.getParameter("cat");
	String categoryDes =request.getParameter("cat_des");
	int ed=Integer.parseInt(request.getParameter("id"));
	System.out.println("Data:"+categoryDes +""+ categoryName+""+ed);
	
	Category_VO category_VO=new Category_VO();
	category_VO.setCategoryName(categoryName);
	category_VO.setCategoryDes(categoryDes);
	category_VO.setCategoryId(ed);
	
	Category_DAO category_DAO=new Category_DAO();
	category_DAO.update(category_VO);
	//response.sendRedirect("admin/search_category.jsp");
	search(request, response);
	
}
protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	int catId =Integer.parseInt(request.getParameter("id"));
	
	System.out.println(catId);
	Category_VO category_VO=new Category_VO();
	category_VO.setCategoryId(catId);
	
	Category_DAO category_DAO=new Category_DAO();
	//category_DAO.delete(category_VO);
	
	HttpSession r= request.getSession();
	
	
	if(!category_DAO.delete(category_VO))
	{
		r.setAttribute("ErrorMsg","Plz Delete Child Class First");
		
	}
	else{
		
		r.removeAttribute("ErrorMsg");
	}
	
	search(request, response);
	
}


	}

