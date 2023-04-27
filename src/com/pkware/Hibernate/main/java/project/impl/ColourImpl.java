package project.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import project.entity.Colour;

public class ColourImpl {
	public Integer addColour(Colour colour, SessionFactory factory) {
		Session s=factory.openSession();
		Transaction tx=null;
		Integer colourId=null;
		try {
			tx=s.beginTransaction();
			colourId=(Integer) s.save(colour);
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
		
		return colourId;
	}
	
	

	public void listColour(SessionFactory factory) {
		Session s=factory.openSession();
		Transaction tx=null;
		try {
			tx = s.beginTransaction();
			List<Colour> colours = s.createQuery("from Colour").list();
			for (Iterator<Colour> iterator = colours.iterator(); iterator.hasNext();) {
				Colour colour = (Colour) iterator.next();
				System.out.println(colour);
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

	public void updateColour(int i, String string, SessionFactory factory) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Colour colour = (Colour) session.get(Colour.class, i);
			colour.setClourName(string);
			session.update(colour);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteColour(int i, SessionFactory factory) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Colour colour = (Colour) session.get(Colour.class, i);
			session.delete(colour);
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
