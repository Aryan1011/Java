package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Student st = new Student();
    	st.setId(103);
    	st.setCity("Ldh");
    	st.setName("mark");
    	st.setCerti(new Certificate("hibernate","4 month"));
    	// In transient state 
    	
    	Session s =factory.openSession();
    	Transaction tx = s.beginTransaction();
    	s.save(st);
//    	now persistent
    	st.setName("griffin");
    	
    	tx.commit();
    	s.close(); // or clear
    	//now detached
//    	if u change in object then changes reflected in object but not in DB
//    	for removed just get that and remove it from DB
    	
    	factory.close();
    	
    	
	}

}
