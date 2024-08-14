package com.saddam.smsystem.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("db")
public class DbStudentService implements StudentService{

    private final StudentRepository repository;

    public DbStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

//    @Override
//    public Student updateStudent(Integer id) {
//        return null;
//    }

    @Override
    public Student updateStudent(Integer id, Student s) {
        Optional<Student> optionalStudent = repository.findById(id);
        if(optionalStudent.isPresent()){
            Student existingStudent = optionalStudent.get();
            existingStudent.setFirstName(s.getFirstName());
            existingStudent.setLastName(s.getLastName());
            existingStudent.setEmail(s.getEmail());
            existingStudent.setNumber(s.getNumber());
            existingStudent.setAge(s.getAge());
            return repository.save(existingStudent);
        }else {
            throw new RuntimeException("student not found " + id);

        }
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }


}
