package com.saddam.smsystem.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){

        return studentService.findByEmail(email);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student s){

        return studentService.updateStudent(id, s);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentService.deleteStudentById(id);
    }

    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }
}
