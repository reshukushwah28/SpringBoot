package com.reshu.demo.scope;

import com.reshu.demo.StudentServer.Entity.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class LPU {

    public LPU() {
        System.out.println("LPU RANK 1");
    }

    public void admission(Student student) {
        System.out.println("Admission");
    }

    public void exam() {
        System.out.println("Exams");
    }

    public void pepClass() {
        System.out.println("PEP Classes");
    }
}