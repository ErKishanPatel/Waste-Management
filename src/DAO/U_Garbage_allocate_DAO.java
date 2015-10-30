package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.U_Complaint_VO;
import VO.U_Garbage_allocate_VO;

public class U_Garbage_allocate_DAO {
	public void insert(U_Garbage_allocate_VO garbage_allocate_VO) {
		// TODO Auto-generated method stub
		try
		{System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(garbage_allocate_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public List chartData() {
		// TODO Auto-generated method stub
		List list= new ArrayList();
		try
		{
			
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
			  Query q= session.createQuery("SELECT COUNT(uvo.allocationId),uvo.ar.areaName FROM U_Garbage_allocate_VO as uvo GROUP BY uvo.ar.areaName");
			  list=q.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;

	}

}
