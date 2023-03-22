package com.jpa.repository;

import com.jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepo extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);
    public List<Student> findByLastName(String lastName);
    public List<Student> findByFirstNameOrLastName(String firstName,String lastName);
    public List<Student> findBySem(int sem);
    public List<Student> findByUsn(Long usn);
    public List<Student> findByFirstNameAndLastName(String firstName,String lastName);
    public List<Student> findByFirstNameAndSem(String firstName,int sem);

}
