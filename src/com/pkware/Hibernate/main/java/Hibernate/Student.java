package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

// u have marked now that this is entity, now hibernate will be able to make table, save objects
@Entity //(name="student_details") // @Table(name="newTableName")
public class Student {
	
	@Id // making primary key
	private int id;
	private String name;
	private String city;
	private Certificate certi;
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
}
