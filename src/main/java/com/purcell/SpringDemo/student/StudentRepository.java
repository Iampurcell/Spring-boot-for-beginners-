package com.purcell.SpringDemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);

    void deleteByEmail(String email);
}
