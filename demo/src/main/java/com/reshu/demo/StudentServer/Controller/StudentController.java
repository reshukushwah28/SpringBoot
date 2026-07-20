package com.reshu.demo.StudentServer.Controller;

import com.reshu.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.reshu.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.reshu.demo.StudentServer.Entity.Student;
import com.reshu.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<CreateStudentResponseDTO> createStudent(
            @RequestBody CreateStudentRequestDTO requestDTO) {

        CreateStudentResponseDTO response =
                studentService.createStudent(requestDTO);

        return ResponseEntity.status(201).body(response);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(student);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,
                                           @RequestBody Student student) {

        Student updatedStudent = studentService.updateStudent(id, student);

        if (updatedStudent == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(updatedStudent);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {

        boolean deleted = studentService.deleteStudent(id);

        if (!deleted) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok("Student deleted successfully");
    }
}