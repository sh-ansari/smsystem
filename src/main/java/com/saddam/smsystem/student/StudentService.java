package com.saddam.smsystem.student;

import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    Student save(Student s);
    public List<Student> findAllStudent();

    Student findByEmail(String email);

    Student updateStudent(Integer id, Student s);

    void deleteStudentById(Integer id);

}
