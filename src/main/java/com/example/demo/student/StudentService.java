package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Vesa",
                "vesafetahaj2@gmail.com",
                LocalDate.of(2004, Month.JUNE,30),
                19));
    }
}
