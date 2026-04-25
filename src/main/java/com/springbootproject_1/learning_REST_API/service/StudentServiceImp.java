package com.springbootproject_1.learning_REST_API.service;

import com.springbootproject_1.learning_REST_API.dto.StudentDto;
import com.springbootproject_1.learning_REST_API.entity.Student;
import com.springbootproject_1.learning_REST_API.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {
   private final StudentRepo studentrepo;

    @Override
    public List<StudentDto> getAllStudents() {
    List<Student> students = studentrepo.findAll();
    return students
            .stream()
            .map(student -> new StudentDto(student.getId(),student.getName(), student.getEmail()))
            .toList();

    }
    public StudentDto getStudentByid(Long id){
      Student student=studentrepo.findById(id).orElseThrow(()->IllegalArgumentException("Student not found"));
    }


}
