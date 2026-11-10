package com.strikes.crudSpringBootDemo.controller;

import com.strikes.crudSpringBootDemo.entity.Student;
import com.strikes.crudSpringBootDemo.repository.StudentRepository;
import com.strikes.crudSpringBootDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")

public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        Student createStudent = studentService.createStudent(student);
        return createStudent;
    }
}



//@RestController
//@RequestMapping("/api/student")
//public class StudentController {
//
//    private StudentService studentService;
//
//    // Deleteging Student Controller in the Student Service
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @PostMapping("/create")
//    public /*ResponseEntity<Student> */Student createStudent(@RequestBody Student student){
//
////        System.out.println("Inside Student Controller");
//        Student createdStudent1 = studentService.createStudent(student);
////        System.out.println("Exiting Student Controller");
//
//        // Http Code Send
//        return createdStudent1;
//                /*ResponseEntity.
//                status(HttpStatus.CREATED).
//                body(createdStudent1);*/
//    }
//}
