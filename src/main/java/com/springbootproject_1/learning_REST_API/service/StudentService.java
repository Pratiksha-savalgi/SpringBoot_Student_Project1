package com.springbootproject_1.learning_REST_API.service;

import com.springbootproject_1.learning_REST_API.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentByid();
}
