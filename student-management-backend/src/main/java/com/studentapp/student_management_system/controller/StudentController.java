<<<<<<< HEAD
package com.studentapp.student_management_system.controller;

import com.studentapp.student_management_system.entity.Student;
import com.studentapp.student_management_system.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {


    private final StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }


    @PostMapping
    public Student create(@Valid @RequestBody Student student) {
        return service.createStudent(student);
    }


    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }


    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }


    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @Valid @RequestBody Student student) {
        return service.updateStudent(id, student);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
=======
package com.studentapp.student_management_system.controller;

import com.studentapp.student_management_system.entity.Student;
import com.studentapp.student_management_system.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {


    private final StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }


    @PostMapping
    public Student create(@Valid @RequestBody Student student) {
        return service.createStudent(student);
    }


    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }


    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }


    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @Valid @RequestBody Student student) {
        return service.updateStudent(id, student);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
>>>>>>> b2b32b5894f438b0135104dd20af698907c04c80
}