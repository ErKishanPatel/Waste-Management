package DAO;
import VO.Area_VO;






import VO.Schedule_VO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





import java.util.List;
import java.util.ArrayList;

public class Area_DAO {
	public void insert(Area_VO area_VO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(area_VO);
			  
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
			  Query q= session.createQuery("from Area_VO");
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
			  Query q= session.createQuery("from Area_VO");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	public List<?> edit(Area_VO area_VO)
	{
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from Area_VO where id="+area_VO.getAreaId()+"");
			  list=q.list();
			  return list;
			  
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
		
	}
	public void update(Area_VO area_VO){
		try
		{
			System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(area_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	
	}
	public boolean delete(Area_VO area_VO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(area_VO);
			  
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
	public List<?> loadArea(Area_VO area_VO) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		 SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		System.out.println("Before Qqqqqqqqqqqqq");
		Query q=ss.createQuery("from Area_VO where jh = "+area_VO.getJh().getWardId());
		
		l1=q.list();
		
		return l1;
	
	}
	public List search(Area_VO area_VO) {
		// TODO Auto-generated method stub
		List<?> list= new ArrayList<>();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("from Area_VO a where areaId='"+area_VO.getAreaId()+"'");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
		
		
		
	}
	
	
	
	}
