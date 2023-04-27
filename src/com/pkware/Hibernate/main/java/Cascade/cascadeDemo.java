package Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Map.Answer;
import Map.Question;

public class cascadeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session s = factory.openSession();
    	
    	Question q= new Question();
    	q.setQuestionId(567);
    	q.setQuestion("What is Cascading");
    	
    	Answer a1 = new Answer(2314,"In hibernate");
    	Answer a2 = new Answer(2344,"B answer");
    	Answer a3 = new Answer(2744,"C answer");
    	
    	List<Answer> ls = new ArrayList<>();
		ls.add(a1);
		ls.add(a2);
		ls.add(a3);
		q.setAnswers(ls);
    	
		Transaction tx = s.beginTransaction();
		
//		on saving this answers wont be saved, so we require s.save(a1) and so on 
//    	on cascade on parent entity all child entity will perform the required action like save and delete
		s.save(q);
    	
    	
    	tx.commit();
    	s.close();
    	factory.close();
	}

}
