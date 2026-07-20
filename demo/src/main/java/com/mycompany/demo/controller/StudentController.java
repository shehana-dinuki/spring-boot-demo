package com.mycompany.demo.controller;

import com.mycompany.demo.model.Student;
import com.mycompany.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // CREATE
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student saved = studentService.createStudent(student);
        return new ResponseEntity<>(saved, HttpStatus.CREATED); // 201
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK); // 200
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id)
                .map(student -> new ResponseEntity<>(student, HttpStatus.OK)) // 200
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); // 404
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updated = studentService.updateStudent(id, student);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK); // 200
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        boolean deleted = studentService.deleteStudent(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
    }
}