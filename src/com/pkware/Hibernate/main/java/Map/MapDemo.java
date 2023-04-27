package Map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	// one to one
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is Java");
//		Answer a1 = new Answer();
//		a1.setAnswerId(343);
//		a1.setAnswer("An oops Language");
//		a1.setQuestion(q1);
//		q1.setAnswer(a1);
//		
//		Question q2 = new Question();
//		q2.setQuestionId(242);
//		q2.setQuestion("What is Collection");
//		Answer a2 = new Answer();
//		a2.setAnswerId(344);
//		a2.setAnswer("API to work with objects");
//		a2.setQuestion(q2);
//		q2.setAnswer(a2);
		
		// one to many
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is Java");
//		
//		Answer a1 = new Answer();
//		a1.setAnswerId(343);
//		a1.setAnswer("An oops Language");
//		a1.setQuestion(q1);
//		Answer a2 = new Answer();
//		a2.setAnswerId(344);
//		a2.setAnswer("We can create Web apps with it");
//		a2.setQuestion(q1);
//		Answer a3 = new Answer();
//		a3.setAnswerId(345);
//		a3.setAnswer("We can create Android apps");
//		a3.setQuestion(q1);
//		List<Answer> ls = new ArrayList<>();
//		ls.add(a1);
//		ls.add(a2);
//		ls.add(a3);
//		q1.setAnswers(ls);
		
//		System.out.println(q1);
//		System.out.println("/////////////////////////////");
		
		Session session = factory.openSession();
		
		
    	Transaction tx = session.beginTransaction(); 
    	
//    	session.save(q1);
//    	session.save(q2);
//    	session.save(a1);
//    	session.save(a2);
    	
//    	one to many
//    	session.save(q1);
//    	session.save(a1);
//    	session.save(a2);
//    	session.save(a3);
		
    	Question q = (Question) session.get(Question.class, 1212);
    	System.out.println(q.getQuestion());
    	
    	for(Answer a:q.getAnswers()) {
    		System.out.println(a.getAnswer());
    	}
    	
		tx.commit();
    	session.close();
    	factory.close();
    	
	}

}
