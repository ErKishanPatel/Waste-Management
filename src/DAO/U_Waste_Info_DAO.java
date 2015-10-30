package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.U_Complaint_VO;
import VO.U_Waste_Info_VO;

public class U_Waste_Info_DAO {

	public void insert(U_Waste_Info_VO u_Waste_Info_VO) {
		// TODO Auto-generated method stub
		try
		{System.out.println("2222222");
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(u_Waste_Info_VO);
			  
			  System.out.println("333");
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
