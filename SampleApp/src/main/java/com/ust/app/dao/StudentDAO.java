package com.ust.app.dao;

import java.util.ArrayList;
import java.util.List;
import com.ust.app.pojo.Student;
import org.springframework.stereotype.Component;


@Component
public class StudentDAO {
    private List<Student> students;


    public StudentDAO() {
        students = new ArrayList<>();
        students.add(new Student(1, "John", "10th", 80));
        students.add(new Student(2, "Jane", "11th", 90));
        students.add(new Student(3, "Bob", "12th", 85));
    }


    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public List<Student> getStudents() {
       return students;
    }
}
