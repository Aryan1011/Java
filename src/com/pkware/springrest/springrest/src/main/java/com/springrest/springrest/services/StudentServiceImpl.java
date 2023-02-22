package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
//	List<Student> list;
/*	public StudentServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Student(101,"Aryan",80));
//		list.add(new Student(102,"Chauhan",90));
	}
	
	
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}
	@Override
	public Student addStudent(Student student) {
//		list.add(student);
		studentDao.save(student);
		return student;
	}
	@Override
	public Student getStudent(int id) {
//		Student s=null;
//		for(Student student:list) {
//			if(student.getId()==id) {
//				s=student;
//				break;
//			}
//		}	
		Optional<Student> st= studentDao.findById(id);
		Student student = st.get();
		return student;
	}
	@Override
	public Student deleteStudent(int id) {
//		Student s=null;
//		for(Student student:list) {
//			if(student.getId()==id) {
//				s=student;
//				break;
//			}
//		}	
//		list.remove(s);
		
//		return s;
		Optional<Student> st= studentDao.findById(id);
		Student student = st.get();
		studentDao.deleteById(id);
		return student;
		
	}
	@Override
	public Student updateStudent(Student student) {
//		list.forEach(e->{
//			if(e.getId()==student.getId()) {
//				e.setName(student.getName());
//				e.setMarks(student.getMarks());
//			}
//		});
		studentDao.save(student);
		return student;
	}
	
	*/
	
	//////handling edge cases and status code
	
	
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}
	@Override
	public Student addStudent(Student student) {
		int id = student.getId();
		Optional<Student> st= studentDao.findById(id);
		if(st.isPresent()) {
			return null;						
		}
		else {
			studentDao.save(student);
			return student;			
		}
	}
	@Override
	public Student getStudent(int id) {
		Optional<Student> st= studentDao.findById(id);
		if(st.isPresent()) {
			Student student = st.get();			
			return student;
		}
		else {
			return null;
		}
		
	}
	@Override
	public Student deleteStudent(int id) {
		Optional<Student> st= studentDao.findById(id);
		
		if(st.isPresent()) {
			Student student = st.get();
			studentDao.deleteById(id);
			return student;				
		}
		else {
			return null;
		}
	}
	@Override
	public Student updateStudent(Student student) {
		int id=student.getId();
		Optional<Student> st= studentDao.findById(id);
		if(st.isPresent()) {
			studentDao.save(student);
			return student;				
		}
		else {
			return null;
		}
	} 
}
