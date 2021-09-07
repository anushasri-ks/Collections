package com.xworkz.mobile.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileDAOimpl implements MobileDAO {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	@Override
	public void readAllRecords() {
		System.out.println("Reading all mobile records");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery("FROM com.xworkz.mobile.entity.MobileEntity");
			List<MobileEntity> list = query.list();
			list.forEach(l -> System.out.println(l));
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
	}

	@Override
	public double ReadMobilePriceByBrand(String brand) {
		System.out.println("Reading mobile's price by brand");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session
					.createQuery("SELECT mobile_table.price FROM MobileEntity mobile_table WHERE mobile_table.brand = "
							+ "'" + brand + "'");
			Object object = query.uniqueResult();
			if (object != null) {
				Double price = (Double) object;
				return price;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return 0;
	}

	@Override
	public double UpdateMobilePriceByBrand() {
		int result = 0;
		System.out.println("updating mobile's price by brand");
		org.hibernate.Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery(
					"UPDATE MobileEntity mobile_table SET mobile_table.price='30000' WHERE mobile_table.brand='One plus'");

			result = query.executeUpdate();
			System.out.println("Updated Successfully " + result);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return result;
	}

	@Override
	public double readTotalPriceOfMobile() {
		System.out.println("Reading mobile's Total price");
		org.hibernate.Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery(
					"SELECT SUM(mobile_table.price) FROM MobileEntity mobile_table");
			Object object = query.uniqueResult();
			if (object != null) {
				Double price = (Double) object;
				return price;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;
	}

	@Override
	public double readMinPriceOfMobile() {
		System.out.println("Reading mobile's minimum price");
		org.hibernate.Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery(
					"SELECT MIN(mobile_table.price) FROM MobileEntity mobile_table");
			Object object = query.uniqueResult();
			if (object != null) {
				Double price = (Double) object;
				return price;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;
	}

	@Override
	public double readMaxPriceOfMobile() {
		System.out.println("Reading mobile's maximum price");
		org.hibernate.Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery(
					"SELECT MAX(mobile_table.price) FROM MobileEntity mobile_table");
			Object object = query.uniqueResult();
			if (object != null) {
				Double price = (Double) object;
				return price;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;
	}

	@Override
	public double readSumPriceOfMobile() {

		return 0;
	}
}