package com.example.student.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.student.entity.Student;
public interface StuRepo
	extends MongoRepository<Student, Integer> {
}