package com.springboot.StudentManagement;

import com.springboot.StudentManagement.entity.Student;
import com.springboot.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Bruno", "Ionitoiu", "bruno.ionitoiu@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Tummy", "Ionitoiu", "tummy.ionitoiu@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Cuddle", "Ionitoiu", "cuddle.ionitoiu@gmail.com");
//		studentRepository.save(student3);
	}
}
