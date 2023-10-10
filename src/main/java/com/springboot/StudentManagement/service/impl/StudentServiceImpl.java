package com.springboot.StudentManagement.service.impl;

import com.springboot.StudentManagement.entity.Student;
import com.springboot.StudentManagement.repository.StudentRepository;
import com.springboot.StudentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
