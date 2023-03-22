package com.jpa.service;

import com.jpa.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationService {
    Student saveStudent(Student student);

    Student findStudentByUsn(Long usn);

    List<Student> findAllStudent();

    Student updateStudent(Student student);

    void deleteById(Long usn);

    List<Student> findByFirstName(String firstName);

    List<Student> findByLastName(String firstName);

    List<Student> findBySem(Integer sem);

    List<Student> findByFirstNameOrLastName(String firstName, String lastName);

    List<Student> findByUsn(Long usn);

    List<Student> findByFirstNameAndLastName(String firstName,String lastName);

    List<Student> findByFirstNameAndSem(String firstName,int sem);
}
