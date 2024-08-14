package com.saddam.smsystem.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                        "Saddam",
                        "Ansari",
                        "sh.ansari746@gmail.com",
                        "8700908498",
                        30
                ),
                new Student(
                        "Ammar",
                        "Ansari",
                        "shansari721@gmail.com",
                        "8700908498",
                        4
                )
        );
    }
}
