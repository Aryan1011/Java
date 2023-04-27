package Map;

import java.util.List;

import javax.persistence.*;

@Entity
public class Question {
	@Id
	private int questionId;
	private String question;
//	@OneToOne
//	@JoinColumn(name="a_id") // renaming FK column
//	private Answer answer;
	@OneToMany  (mappedBy = "question", fetch = FetchType.EAGER,cascade =CascadeType.ALL ) // extra table not formed now
	private List<Answer> answers;
	
	
@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	//	
//	public Question() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Question(int questionId, String question, Answer answer) {
//		super();
//		this.questionId = questionId;
//		this.question = question;
//		this.answer = answer;
//	}
	public int getQuestionId() {
		return questionId;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionId, String question, List<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
//	public Answer getAnswer() {
//		return answer;
//	}
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}
}
