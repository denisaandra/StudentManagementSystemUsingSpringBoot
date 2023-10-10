package com.springboot.StudentManagement.service;

import com.springboot.StudentManagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(Long id);
}
