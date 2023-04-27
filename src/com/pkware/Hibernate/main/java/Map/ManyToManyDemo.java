package Map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(30);
		e1.setEname("Ram");
		
		e2.setEid(31);
		e2.setEname("Shyam");
		
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setPid(1);
		p1.setPname("Chatbot");
		p2.setPid(2);
		p2.setPname("Web");
		
		List<Emp> l1 = new ArrayList<>();
		List <Project> l2 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l2.add(p2);
		l2.add(p1);
		
		e1.setProjects(l2);
		p2.setEmps(l1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p2);
		s.save(p1);
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
