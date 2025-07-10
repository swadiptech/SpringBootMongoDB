package com.swarup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swarup.entity.Student;
import com.swarup.repo.StudentRepository;

@Service
public class StudentService {
	
 private StudentRepository repo;
 
 public StudentService(StudentRepository repo) {
	 this.repo=repo;
 }
  
 public List<Student>getAll(){
	return repo.findAll();
	 
 }
public Student getById(String id) {
	return repo.findById(id).orElse(null);
	
}
 public void delete(String id) {
	 repo.deleteById(id);
 }
 
 public List<Student> getByCourse(String course){
	return repo.findByCourse(course);
 }

public Student save(Student student) {

	return repo.save(student);
}
}
