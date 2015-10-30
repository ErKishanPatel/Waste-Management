package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.Subcat_VO;
import VO.Ward_VO;
import VO.Zone_VO;

public class Ward_DAO {
	public void insert(Ward_VO ward_VO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(ward_VO);
			  
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
		public List<?> load()
		{
			List<?> list= new ArrayList<>();
			try
			{
				
				 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
				  Query q= session.createQuery("from Ward_VO");
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
				  Query q= session.createQuery("from Ward_VO");
				  list=q.list();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
		}

		public List<?> edit(Ward_VO ward_VO)
		{
			List<?> list= new ArrayList<>();
			try
			{
				
				 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
				  Query q= session.createQuery("from Ward_VO where id="+ward_VO.getWardId()+"");
				  list=q.list();
				  return list;
				  
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
			
		}
		public void update(Ward_VO ward_VO){
			try
			{
				System.out.println("2222222");
				  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
			   
				  Transaction tr = session.beginTransaction();
				  
				  session.update(ward_VO);
				  
				  System.out.println("333");
				  tr.commit();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		
		}
		public boolean delete(Ward_VO ward_VO){
			try
			{
		
				  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				  
				  Session session =sessionFactory.openSession();
			   
				  Transaction tr = session.beginTransaction();
				  
				  session.delete(ward_VO);
				  
				  
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
		public List<?> loadWard(Ward_VO ward_VO) {
			// TODO Auto-generated method stub
		 		
				List<?> l=new ArrayList<>();
				 SessionFactory sf= new Configuration().configure().buildSessionFactory();
				Session ss=sf.openSession();
				//Transaction t=ss.beginTransaction();
				Query q=ss.createQuery("from Ward_VO where zoneId = "+ward_VO.getMc().getZoneId());
				l=q.list();
				return l;
			
			
		}

		



	}


