package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentService;

@RestController
public class MyController {
	
//	will bring object and inject here
	@Autowired
	private StudentService studentService;
/*
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable String id){
		return this.studentService.getStudent((int)Integer.parseInt(id));	
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student){
		return this.studentService.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public Student deleteStudent(@PathVariable String id) {
		return this.studentService.deleteStudent((int) Integer.parseInt(id));
		
	} 
	
	*/
//	handling status

	
	/*@GetMapping("/home")
	public ResponseEntity<String> home() {
		return new ResponseEntity<>("This is Home", HttpStatus.OK);
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(){
		return new ResponseEntity<>( this.studentService.getStudents(), HttpStatus.OK);
	}
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable String id){
		return new ResponseEntity<>(this.studentService.getStudent((int)Integer.parseInt(id)),HttpStatus.OK);	
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<>(this.studentService.addStudent(student), HttpStatus.CREATED);
	}
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<>(this.studentService.updateStudent(student), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable String id) {
		return new ResponseEntity<>(this.studentService.deleteStudent((int) Integer.parseInt(id)), HttpStatus.ACCEPTED);
		
	}*/
	
//	handling status and edge cases
	
	
	@GetMapping("/home")
	public ResponseEntity<String> home() {
		return new ResponseEntity<>("This is Home", HttpStatus.OK);
	}
	@GetMapping("/students")
	public ResponseEntity<Object> getStudents(){
		List<Student> ls = this.studentService.getStudents();
		
		if(ls.isEmpty()) {
			return new ResponseEntity<Object>( "No Records Found", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Object>( ls, HttpStatus.OK);
	}
	@GetMapping("/students/{id}")
	public ResponseEntity<Object> getStudent(@PathVariable String id){
		Student st=this.studentService.getStudent((int)Integer.parseInt(id));
		if(st==null) {
			return new ResponseEntity<Object>( "No Record Found with this ID", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(st,HttpStatus.OK);	
	}
	
	@PostMapping("/students")
	public ResponseEntity<Object> addStudent(@RequestBody Student student){
		Student st=this.studentService.addStudent(student);
		if(st==null) {
			return new ResponseEntity<Object>("Student with ID already Exists", HttpStatus.NOT_ACCEPTABLE);
		}
		else
		return new ResponseEntity<Object>(st, HttpStatus.CREATED);
	}
	
	@PutMapping("/students")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student) {
		Student st=this.studentService.updateStudent(student);
		if(st==null) {
			return new ResponseEntity<Object>("Student with ID doesn't Exist", HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Object>(st, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Object> deleteStudent(@PathVariable String id) {
		Student st=this.studentService.deleteStudent((int) Integer.parseInt(id));
		if(st==null) {
			return new ResponseEntity<Object>("Student with ID doesn't Exist", HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Object>(st, HttpStatus.ACCEPTED);
	}
	
	
}
