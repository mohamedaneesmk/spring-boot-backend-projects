<<<<<<< HEAD
package com.studentapp.student_management_system.service;


import com.studentapp.student_management_system.entity.Student;


import java.util.List;


public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
=======
package com.studentapp.student_management_system.service;


import com.studentapp.student_management_system.entity.Student;


import java.util.List;


public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
>>>>>>> b2b32b5894f438b0135104dd20af698907c04c80
}