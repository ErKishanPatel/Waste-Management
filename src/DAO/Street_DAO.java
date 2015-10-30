package DAO;

import VO.Area_VO;
import VO.Category_VO;
import VO.Street_VO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import java.util.List;
import java.util.ArrayList;

public class Street_DAO {
	public void insert(Street_VO street_VO) {
		try {
			System.out.println("2222222");
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tr = session.beginTransaction();

			session.save(street_VO);
			System.out.println("333");
			tr.commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public List load() {
		List list = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from Street_VO");
			list = q.list();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return list;
	}

	public List search() {
		List list = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from Street_VO");
			list = q.list();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return list;
	}

	public List edit(Street_VO street_VO) {
		List list = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from Street_VO where id="
					+ street_VO.getStreetId() + "");
			list = q.list();
			return list;

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return list;

	}

	public void update(Street_VO street_VO) {
		try {
			System.out.println("2222222");
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tr = session.beginTransaction();

			session.update(street_VO);

			System.out.println("333");
			tr.commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public boolean delete(Street_VO street_VO) {
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tr = session.beginTransaction();

			session.delete(street_VO);

			tr.commit();

		} catch (Exception exception) {
			exception.printStackTrace();
			String s[] = exception.getCause() != null ? exception.getCause()
					.toString().split(":") : null;
			if (s[0] != null && s[0].equals("java.sql.BatchUpdateException")) {
				return false;

			}

		}
		return true;

	}

	public List<?> loadStreet(Street_VO street_VO) {
		// TODO Auto-generated method stub
		List l2 = new ArrayList();
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		System.out.println("Before Qqqqqqqqqqqqq");
		Query q = ss.createQuery("from Street_VO where lm = "
				+ street_VO.getLm().getAreaId());

		l2 = q.list();

		return l2;

	}

}
