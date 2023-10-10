package com.springboot.StudentManagement.repository;

import com.springboot.StudentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
    //it contains all the CRUD operations to interact with the database
}
