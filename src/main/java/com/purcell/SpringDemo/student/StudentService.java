package com.purcell.SpringDemo.student;

import java.util.List;


public interface StudentService {

    Student save(Student s); //this method will save students in the memory

    public List<Student> findAllStudents();

    Student findByEmail(String email); //This will fetch or return the students with the same email

    Student update(Student s);

    void delete(String email); //This will delete student with the same email

}
