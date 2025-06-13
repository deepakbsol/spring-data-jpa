package com.jpa.controller;

import com.jpa.entities.Student;
import com.jpa.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    private RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService){
        this.registrationService=registrationService;
    }

    @PostMapping("/save-student")
    public Student saveStudent(@RequestBody Student student){
        return this.registrationService.saveStudent(student);
    }

    @GetMapping("/get-student/{usn}")
    public Student findStudentByUsn(@PathVariable Long usn){
        return this.registrationService.findStudentByUsn(usn);
    }

    @GetMapping("/get-all-student")
    public List<Student> findAllStudents(){
        return this.registrationService.findAllStudent();
    }

    @PutMapping("/update-student")
    public Student updateStudent(@RequestBody Student student){
        return this.registrationService.updateStudent(student);
    }

    @DeleteMapping("delete-student/{usn}")
    public void deleteStusent(@PathVariable Long usn){
         this.registrationService.deleteById(usn);
    }





    @GetMapping("/find-by-first-name/{firstName}")
    public List<Student> findByFirstName(@PathVariable String firstName){
        return this.registrationService.findByFirstName(firstName);
    }
    @GetMapping("/find-by-last-name/{lastName}")
    public List<Student> findByLastName(@PathVariable String lastName){
        return this.registrationService.findByLastName(lastName);
    }
    @GetMapping("/find-by-sem/{sem}")
    public List<Student> findBySem(@PathVariable Integer sem){
        return this.registrationService.findBySem(sem);
    }
    @GetMapping("/find-by-first-or-last-name/{firstName}/{lastName}")
    public List<Student> findByFirstNameOrLastName(@PathVariable String firstName,@PathVariable String lastName){
        return this.registrationService.findByFirstNameOrLastName(firstName,lastName);
    }
    @GetMapping("/find-by-usn/{usn}")
    public List<Student> findByUsn(@PathVariable Long usn){
        return this.registrationService.findByUsn(usn);
    }
    @GetMapping("/find-by-first-and-last-name/{firstName}/{lastName}")
    public List<Student> findByFirstNameAndLastName(@PathVariable String firstName,@PathVariable String lastName){
        return this.registrationService.findByFirstNameAndLastName(firstName,lastName);
    }

    @GetMapping("/find-by-first-name-and-sem/{firstName}/{sem}")
    public List<Student> findByFirstNameAndLastName(@PathVariable String firstName,@PathVariable Integer sem){
        return this.registrationService.findByFirstNameAndSem(firstName,sem);
    }

    @GetMapping(value = "test/api")
    public String apiTest() {
    	return "Api Test";
    }
    @GetMapping(value = "test")
    public String test() {
    	return "Test";
    }
}
