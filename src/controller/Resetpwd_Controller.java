package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import DAO.LoginDAO;
import VO.LoginVO;

/**
 * Servlet implementation class Resetpwd_Controller
 */
@WebServlet("/Resetpwd_Controller")
public class Resetpwd_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resetpwd_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("forgot password POST method invocked!!!!!!!");
		
		String userName=request.getParameter("userName");
		
		LoginVO loginVO=new LoginVO();
		loginVO.setUserName(userName);
		
		LoginDAO loginDAO=new LoginDAO();
		loginDAO.forgot(loginVO);
		
		System.out.println("User inputtttttt emaillllllllllll: "+userName);
		
		List ls=loginDAO.forgot(loginVO);
		System.out.println("FORGOT SEARCH METHOD INVOCKED!!");
		
		Iterator iterator = ls.iterator();
		while(iterator.hasNext())
		{
			LoginVO lvo = (LoginVO) iterator.next();
			
			sendMail(lvo, request, response);
		}
		if(ls.size() == 0)
		{
			response.sendRedirect("user/welcome.jsp");
		}
		else
		{
			response.sendRedirect("ogin.jsp");
		}	
		
	
		
		//System.out.println("LOGIN VO  id ::::::::::::::::::::::::::;"+userId);
		
		
		
		
		
	}

	
	private void sendMail(LoginVO login_VO, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		java.util.Properties properties = new java.util.Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		javax.mail.Session mailSession = javax.mail.Session
				.getInstance(properties);
		mailSession.setDebug(false);

		try {
			
			MimeMessage message = new MimeMessage(mailSession);
           System.out.println("username===="+login_VO.getUserName());
           System.out.println("password====="+login_VO.getUserPassword());
			message.setContent("Hello, <br>UserName is : "+login_VO.getUserName()+" <br> and Password is : "+login_VO.getUserPassword()+" ", "text/html");
			message.setSubject("Your User Name and Password");

			InternetAddress sender = new InternetAddress("pratikcp17@gmail.com","Administrator");
			InternetAddress receiver = new InternetAddress(login_VO.getUserName());
			message.setFrom(sender);
			message.setRecipient(Message.RecipientType.TO,receiver);
			message.saveChanges();

			javax.mail.Transport transport = mailSession.getTransport("smtp");
			transport.connect("smtp.gmail.com", 587,"pratikcp17@gmail.com","hacking.7383585759");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();

		} catch (Exception e) {
			System.out.println("err = " + e);
		}


	
	}
	
	
	
}
