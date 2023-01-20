package com.ust.app.controller;

import com.ust.app.dao.StudentDAO;
import com.ust.app.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {



    @Autowired
    private StudentDAO studentDAO;


    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentDAO.getStudent(id);
    }
    @GetMapping("/students")
    public List<Student> getStudent() {
        return studentDAO.getStudents();
    }

}