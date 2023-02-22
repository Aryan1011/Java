package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentService {
	public List<Student> getStudents();

	public Student getStudent(int id);

	public Student addStudent(Student student);

	public Student deleteStudent(int id);

	public Student updateStudent(Student student);
}
