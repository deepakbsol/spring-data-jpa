package com.jpa.service;

import com.jpa.entities.Student;
import com.jpa.repository.RegistrationRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    private RegistrationRepo registrationRepo;
    public RegistrationServiceImpl(RegistrationRepo registrationRepo){
        this.registrationRepo=registrationRepo;
    }
    @Override
    public Student saveStudent(Student student) {
        return this.registrationRepo.save(student);
    }

    @Override
    public Student findStudentByUsn(Long usn) {
        Optional<Student> res=this.registrationRepo.findById(usn);
        return res.get() !=null?res.get():null;
    }

    @Override
    public List<Student> findAllStudent() {
        return this.registrationRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return this.registrationRepo.save(student);
    }

    @Override
    public void deleteById(Long usn) {
         this.registrationRepo.deleteById(usn);
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        return this.registrationRepo.findByFirstName(firstName);
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        return this.registrationRepo.findByLastName(lastName);
    }

    @Override
    public List<Student> findBySem(Integer sem) {
        return this.registrationRepo.findBySem(sem);
    }

    @Override
    public List<Student> findByFirstNameOrLastName(String firstName, String lastName) {
        return this.registrationRepo.findByFirstNameOrLastName(firstName,lastName);
    }

    @Override
    public List<Student> findByUsn(Long usn) {
        return this.registrationRepo.findByUsn(usn);
    }

    @Override
    public List<Student> findByFirstNameAndLastName(String firstName,String lastName) {
        return this.registrationRepo.findByFirstNameAndLastName(firstName,lastName);
    }

    @Override
    public List<Student> findByFirstNameAndSem(String firstName,int sem) {
        return this.registrationRepo.findByFirstNameAndSem(firstName,sem);
    }
}
