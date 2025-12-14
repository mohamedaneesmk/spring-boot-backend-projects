<<<<<<< HEAD
package com.studentapp.student_management_system.service;

import com.studentapp.student_management_system.entity.Student;
import com.studentapp.student_management_system.exception.GlobalExceptionHandler;
import com.studentapp.student_management_system.exception.ResourceNotFoundException;
import com.studentapp.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    private final StudentRepository repository;


    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }


    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }


    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
    }


    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);

        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        existing.setPhoneNumber(student.getPhoneNumber()); // 👈 ADD THIS

        return repository.save(existing);
    }



    @Override
    public void deleteStudent(Long id) {
        repository.delete(getStudentById(id));
    }
=======
package com.studentapp.student_management_system.service;

import com.studentapp.student_management_system.entity.Student;
import com.studentapp.student_management_system.exception.GlobalExceptionHandler;
import com.studentapp.student_management_system.exception.ResourceNotFoundException;
import com.studentapp.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    private final StudentRepository repository;


    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }


    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }


    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
    }


    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);

        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        existing.setPhoneNumber(student.getPhoneNumber()); // 👈 ADD THIS

        return repository.save(existing);
    }



    @Override
    public void deleteStudent(Long id) {
        repository.delete(getStudentById(id));
    }
>>>>>>> b2b32b5894f438b0135104dd20af698907c04c80
}