package project.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;

import project.entity.Car;
import project.entity.Colour;

public class Implementation {
	
	public Integer addCar(Car car,Colour colour, SessionFactory factory) {
		Session s=factory.openSession();
		Transaction tx=null;
		Integer carId=null;
		try {
			tx=s.beginTransaction();
			car.setColour(colour);
			carId=(Integer) s.save(car);
			tx.commit();
		}
		catch(Exception e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
		return carId;
	}

	public void listCar(SessionFactory factory) {
		Session s=factory.openSession();
		Transaction tx=null;
		try {
			tx = s.beginTransaction();
			List<Car> cars = s.createQuery("from Car").list();
			for (Iterator<Car> iterator = cars.iterator(); iterator.hasNext();) {
				Car car = (Car) iterator.next();
				System.out.println(car);
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
	}

	public void updateCar(int i, String string, SessionFactory factory) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Car car = (Car) session.get(Car.class, i);
			car.setName(string);
			session.update(car);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteCar(int i, SessionFactory factory) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Car car = (Car) session.get(Car.class, i);
			session.delete(car);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}


}
