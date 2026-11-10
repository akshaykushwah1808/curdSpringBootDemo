package com.strikes.crudSpringBootDemo.repository;

import com.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component

public interface StudentRepository extends JpaRepository <Student , Long>{

}


















//public interface StudentRepository extends JpaRepository <Student , Long>{

//    public Student saveStudent(Student studentRes){
//        System.out.println("Inside Student Repository");
//        System.out.println("Exiting Student Repository");
//        Student s1 = new Student();
//        s1.setName("Akash");
//        s1.setAge(25);
//        s1.setEmail("akash@gmail.com");
//        s1.setRollNo(101);
//        s1.setSubject("Physics");

//        return null;
//    }

//}


// Save to db