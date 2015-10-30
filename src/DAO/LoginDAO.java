package DAO;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoginVO;
//import VO.StateVO;

public class LoginDAO {

	public void insert(LoginVO loginVO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(loginVO);
			 
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public List authentication(LoginVO loginVO) {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  //session.save(loginVO);
	
			 // tr.commit();
	
			  Query q = session.createQuery("from LoginVO where userName='"+loginVO.getUserName()+"' and userPassword='"+loginVO.getUserPassword()+"' ");
			  
			  ls = q.list();
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ls;
	}
	public List<?> load()
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from LoginVO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}

	public List forgot(LoginVO loginVO) {
		// TODO Auto-generated method stub
		List ls= new ArrayList();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from LoginVO where userName='"+loginVO.getUserName()+"'  ");
			  ls=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return ls;

	}
	
	
		
}

