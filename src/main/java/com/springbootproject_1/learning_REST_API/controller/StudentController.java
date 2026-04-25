package com.springbootproject_1.learning_REST_API.controller;

import com.springbootproject_1.learning_REST_API.dto.StudentDto;
import com.springbootproject_1.learning_REST_API.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //get api to get request
    @GetMapping("/students")
    public List<StudentDto> getAllStudent() {
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public List<StudentDto> getStudentId(@PathVariable Long id){
        return studentService.getStudentByid(id);
    }
}
