package com.purcell.SpringDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Danniel",
                        "Purcell",
                        LocalDate.now(),
                        21,
                        "iampurcell9@gmail.com"
                ),
                new Student(
                        "Danniel",
                        "Deusy",
                        LocalDate.now(),
                        25,
                        "dannieldeus9@gmail.com"
                )
        );
    }
}