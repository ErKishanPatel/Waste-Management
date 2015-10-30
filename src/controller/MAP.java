package controller;

import java.io.*;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import DAO.Area_DAO;
import DAO.Road_Side_Unit_DAO;
import VO.Area_VO;
import VO.Road_Side_Unit_VO;

/**
 * Servlet implementation class MAP
 */
@WebServlet("/MAP")
public class MAP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int dustID = Integer.parseInt(request.getParameter("dustID"));

		System.out.println("in get");
		HttpSession session = request.getSession();
		String pincode = String.valueOf(session.getAttribute("pincode"));

		try {
			String result = "";
			result += "<root>";
			System.out.println("in Map.java");

			Road_Side_Unit_DAO ad = new Road_Side_Unit_DAO();
			List ls = ad.search(dustID);
			Iterator i = ls.iterator();
			Road_Side_Unit_VO mcv = new Road_Side_Unit_VO();
			while (i.hasNext()) {
				mcv = (Road_Side_Unit_VO) i.next();
				result += "<data>";
				String s1 = String.valueOf(mcv.getLati());

				result += "<latitude>" + s1 + "</latitude>";

				String s2 = String.valueOf(mcv.getLongi());
				result += "<longitude>" + s2 + "</longitude>";

				result += "</data>";
				System.out.println("Latitude::" + s1 + "longitude::" + s2);
			}

			result += "</root>";
			PrintWriter out = response.getWriter();
			out.println(result);
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
