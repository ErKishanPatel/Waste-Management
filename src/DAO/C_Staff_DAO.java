package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.C_Staff_VO;



public class C_Staff_DAO {

	public void insert(C_Staff_VO c_Staff_VO) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  System.out.println("211111111112");
			  session.save(c_Staff_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		
	}

	public List<?> search() {
		// TODO Auto-generated method stub
		
		
			List<?> list= new ArrayList<>();
			try
			{
				
				 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
				  Query q= session.createQuery("from C_Staff_VO");
				  list=q.list();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
		}
	public List<?> load()
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from C_Staff_VO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	public List<?> edit(C_Staff_VO c_Staff_VO)
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from C_Staff_VO where id="+c_Staff_VO.getStaffId()+"");
			  list=q.list();
			  
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	public void update(C_Staff_VO c_Staff_VO){
		try
		{
			System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(c_Staff_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}	
	}
	public void delete(C_Staff_VO c_Staff_VO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(c_Staff_VO);
			  
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	


	


}