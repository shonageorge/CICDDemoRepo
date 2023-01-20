package com.ust.SampleStudentProgram.SampleStudentProgram.controller;

import com.ust.SampleStudentProgram.SampleStudentProgram.model.Student;
import com.ust.SampleStudentProgram.SampleStudentProgram.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studService.getAll();
    }

    @GetMapping("/students/{id}")
    public List<Student> getStudentbyId(@PathVariable int id){
        return studService.getById(id);
    }
}
