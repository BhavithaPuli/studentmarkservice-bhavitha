package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class StudentMarkService {
    @Autowired
    StudentMarkRepository studentMarkServiceRepository;

    public Student addOneStudent(Student student) {
        return studentMarkServiceRepository.add(student);
    }

    public List<Student> findAllStudents() {
        return studentMarkServiceRepository.findAll();
    }

    public Student findById(Integer id) {
        return studentMarkServiceRepository.findById(id);
    }

    public Student deleteById(Integer id) {
        return studentMarkServiceRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentMarkServiceRepository.update(student);
    }
}
