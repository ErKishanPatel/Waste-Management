package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.C_Assign_Area_VO;
import VO.Ward_VO;


public class C_Assign_Area_DAO {
	public void insert(C_Assign_Area_VO c_Assign_Area_VO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(c_Assign_Area_VO);
			  
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	public List load()
	{
		List list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from C_Assign_Area_VO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public List<?> search()
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from C_Assign_Area_VO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}

	public List<?> edit(C_Assign_Area_VO c_Assign_Area_VO)
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from C_Assign_Area_VO where id="+c_Assign_Area_VO.getAssignaId()+"");
			  list=q.list();
			  return list;
			  
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
		
	}
	public void update(C_Assign_Area_VO c_Assign_Area_VO){
		try
		{
			System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(c_Assign_Area_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	
	}
	public boolean delete(C_Assign_Area_VO c_Assign_Area_VO){
		try
		{
	
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(c_Assign_Area_VO);
			  
			  
			  tr.commit();
			  
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			String s[] =exception.getCause()!=null?exception.getCause().toString().split(":"): null;
			if(s[0]!=null && s[0].equals("java.sql.BatchUpdateException"))
			{
				return false;
				
			}
			
		}
		return true;
	
	}
	
}

