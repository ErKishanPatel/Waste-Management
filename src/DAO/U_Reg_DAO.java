package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.C_Reg_VO;
import VO.U_Reg_VO;

public class U_Reg_DAO {

	public void insert(U_Reg_VO u_Reg_VO) {
		// TODO Auto-generated method stub

	
			try
			{System.out.println("2222222");
				  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
			   
				  Transaction tr = session.beginTransaction();
				  System.out.println("211111111112");
				  session.save(u_Reg_VO);
				  
				  System.out.println("333");
				  tr.commit();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		
		}

	
	public List<?> search()
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from U_Reg_VO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}


	
		public void delete(U_Reg_VO u_Reg_VO){
			try
			{
				  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
			   
				  Transaction tr = session.beginTransaction();
				  
				  session.delete(u_Reg_VO);
				  
				  tr.commit();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}


		public List validateUserName(U_Reg_VO u_Reg_VO) {
			// TODO Auto-generated method stub
			List list=new ArrayList();
			try
			{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session =sessionFactory.openSession();
				Query query=session.createQuery("from U_Reg_VO where userName='"+u_Reg_VO.getLogin()+"' ");
				list = query.list();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
		}
		
		}
		
		
	

		
	
	


