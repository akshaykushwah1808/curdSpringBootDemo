package com.strikes.crudSpringBootDemo.service;

import com.strikes.crudSpringBootDemo.entity.Student;
import com.strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        Student studentRes = studentRepository.save(studentReq);
        return studentRes;

    }

}
















//@Service
//public class StudentService {
//    private StudentRepository studentRepository;
//
//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public Student createStudent(Student studentReq){
////        System.out.println("Inside Student Service");
////        Student studentRes = studentRepository.saveStudent(studentReq);
////        System.out.println("Exiting Student Service");
//        Student studentRes = studentRepository.save(studentReq);
//
//        return studentRes;
//    }
//}
