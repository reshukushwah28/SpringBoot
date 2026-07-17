package com.reshu.demo.StudentServer.Service;

import com.reshu.demo.StudentServer.Repository.StudentRepository;
import com.reshu.demo.StudentServer.Entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student){
        int id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        String department = student.getDepartment();

        if(id < 0 || name == null || age < 0 || department == null){
            return null;
        }

        studentRepository.save(student);
        return student;
    }
    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student updateStudent(int id, Student newStudent) {

        Student student = studentRepository.findById(id).orElse(null);

        if (student == null) {
            return null;
        }

        student.setName(newStudent.getName());
        student.setAge(newStudent.getAge());
        student.setDepartment(newStudent.getDepartment());

        return studentRepository.save(student);
    }

    public boolean deleteStudent(int id) {

        if (!studentRepository.existsById(id)) {
            return false;
        }

        studentRepository.deleteById(id);
        return true;
    }
}