package com.securityspring.controller;

import com.securityspring.domain.Student;
import com.securityspring.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String home() {
        return "Home";
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);
    }

}
