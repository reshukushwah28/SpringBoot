package com.reshu.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1  store the student  : post
    @PostMapping("/create")

    public String storeStudent(@RequestBody Student student){
        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();


        return
                "id : "+id + ", name : " +name + ", age : "+age + ", department : department";
    }
    //2 read the students with ids : get
    //3 update the student inf : put/ patch
    //4 delete the student inf : delete
    //all we have to create a method




}
