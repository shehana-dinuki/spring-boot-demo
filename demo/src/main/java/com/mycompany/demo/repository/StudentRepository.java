package com.mycompany.demo.repository;

import com.mycompany.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository already gives us save, findAll, findById, deleteById, etc.
}