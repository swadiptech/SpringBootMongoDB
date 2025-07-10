package com.swarup.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.swarup.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	public abstract List<Student>findByCourse(String course);

}
