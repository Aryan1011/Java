package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
		
    	Certificate certi = new Certificate();
    	certi.setCourse("Android");
    	certi.setDuration("2 mon");
    	
    	
    	Student s1 = new Student();
    	s1.setId(102);
    	s1.setName("Amit");
    	s1.setCity("Ldh");
    	s1.setCerti(certi);
    	
    	Transaction tx= session.beginTransaction();
    	
    	session.save(s1);
    	
    	tx.commit();
    	session.close();
    	factory.close();
	}
}
