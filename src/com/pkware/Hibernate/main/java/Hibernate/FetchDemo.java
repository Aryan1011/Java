package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
		
//    	GET
    	Student st =(Student) session.get(Student.class, 101);
		System.out.println(st);
		Address ad =(Address) session.load(Address.class, 1);
		System.out.println(ad);
		session.close();
		factory.close();
	}

}
