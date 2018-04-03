package ro.dg.springh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.dg.springh2.entity.Student;
import ro.dg.springh2.repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.studentRepository.findAll();
    }

}
