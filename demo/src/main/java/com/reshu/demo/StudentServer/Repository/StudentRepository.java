package com.reshu.demo.StudentServer.Repository;

import com.reshu.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


//    public Student save(Student student){
//        System.out.println("Student Information saved");
//        return student;
//    }
}