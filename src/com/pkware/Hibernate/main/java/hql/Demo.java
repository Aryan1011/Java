package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate.Student;

public class Demo {	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
		
//		HQL Syntax
		String query="from Student"; // where city="Ldh" or use :x, as Fullname, use and or; 
//		q.setParameter("x","Ludhiana")
    	
		Query q=session.createQuery(query);
		
//		single - (Unique)
//		multiple - list
		List<Student> ls= q.list();
		
		for(Student s:ls) {
			System.out.println(s.getName());
		}
		
		session.close();
		factory.close();
    	
	}

}
