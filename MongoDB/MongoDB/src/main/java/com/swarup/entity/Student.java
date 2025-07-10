package com.swarup.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private String id;
	private String name;
	private int age;
	private String course;		
}
