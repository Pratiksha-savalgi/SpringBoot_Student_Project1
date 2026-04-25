package com.springbootproject_1.learning_REST_API.repository;

import com.springbootproject_1.learning_REST_API.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//all queries are written here
@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
