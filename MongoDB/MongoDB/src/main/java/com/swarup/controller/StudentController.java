package com.swarup.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarup.entity.Student;
import com.swarup.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService service;
	
	public StudentController(StudentService service) {
		this.service=service;
	}
	@PostMapping
	public Student create(@RequestBody Student student) {
		return service.save(student);	
	}
	@GetMapping
	public List<Student> getAll(){
		return service.getAll();	
	}
	@GetMapping("/{id}")
	public Student getById(@PathVariable String id) {
		return service.getById(id);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	@GetMapping("/course/{course}")
	public List<Student> getByCourse(@PathVariable String course) {
		return service.getByCourse(course);
	}
}
