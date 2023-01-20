package com.ust.SampleStudentProgram.SampleStudentProgram.service;

import com.ust.SampleStudentProgram.SampleStudentProgram.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadStudents(){
        students.add(new Student(1,"Anu","10",150));
        students.add(new Student(2,"Ram","12",110));
        students.add(new Student(3,"Ayna","11",200));
        students.add(new Student(4,"Sam","10",180));
    }


    public List<Student> getAll() {
        return students;
    }

    public List<Student> getById(int id) {
        return students.stream().filter(m->m.getId()==id).collect(Collectors.toList());
    }
}
