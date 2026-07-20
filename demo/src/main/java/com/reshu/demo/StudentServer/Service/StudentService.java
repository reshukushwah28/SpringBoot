package com.reshu.demo.StudentServer.Service;

import com.reshu.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.reshu.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.reshu.demo.StudentServer.Entity.Student;
import com.reshu.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE STUDENT
    public CreateStudentResponseDTO createStudent(CreateStudentRequestDTO requestDTO) {

        Student student = mapToStudent(requestDTO);

        student = studentRepository.save(student);

        return mapToResponseDTO(student);
    }

    // GET STUDENT BY ID
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE STUDENT
    public Student updateStudent(int id, Student student) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setDepartment(student.getDepartment());

        return studentRepository.save(existingStudent);
    }

    // DELETE STUDENT
    public boolean deleteStudent(int id) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return false;
        }

        studentRepository.delete(existingStudent);

        return true;
    }

    // DTO -> ENTITY
    private Student mapToStudent(CreateStudentRequestDTO requestDTO) {

        Student student = new Student();

        student.setName(requestDTO.getName());
        student.setAge(requestDTO.getAge());
        student.setDepartment(requestDTO.getDepartment());

        return student;
    }

    // ENTITY -> DTO
    private CreateStudentResponseDTO mapToResponseDTO(Student student) {

        CreateStudentResponseDTO responseDTO = new CreateStudentResponseDTO();

        responseDTO.setId(student.getId());
        responseDTO.setName(student.getName());
        responseDTO.setAge(student.getAge());
        responseDTO.setDepartment(student.getDepartment());

        return responseDTO;
    }
}