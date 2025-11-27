package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/sms")
public class StudentMarkController {

    private final StudentMarkService service;

    public StudentMarkController(StudentMarkService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping("/addOne")
    public ResponseEntity<Student> addOneStudent(@RequestBody Student student) {
        student = service.addOneStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // READ ALL
    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAllStudents() {
        List<Student> studentList = service.findAllStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    // READ BY ID
    @GetMapping("/findById/{id}")
    public ResponseEntity<Student> findById(@PathVariable Integer id) {
        Student student = service.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // DELETE BY ID
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        service.deleteById(id);
        return new ResponseEntity<>("Deleted student with id: " + id, HttpStatus.OK);
    }

    // UPDATE
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        student = service.updateStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
