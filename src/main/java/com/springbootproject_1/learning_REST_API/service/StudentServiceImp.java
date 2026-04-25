package com.springbootproject_1.learning_REST_API.service;

import com.springbootproject_1.learning_REST_API.dto.StudentDto;
import com.springbootproject_1.learning_REST_API.entity.Student;
import com.springbootproject_1.learning_REST_API.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {
   private final StudentRepo studentrepo;
   private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
    List<Student> students = studentrepo.findAll();
    return students
            .stream()
            .map(student -> new StudentDto(student.getId(),student.getName(), student.getEmail()))
            .toList();

    }

    @Override
    public StudentDto getStudentByid(Long id) {
        Student student=studentrepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Student not found"));
        return modelMapper.map(student,StudentDto.class);
    }





}
