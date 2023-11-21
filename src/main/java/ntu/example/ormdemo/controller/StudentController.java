package ntu.example.ormdemo.controller;

import ntu.example.ormdemo.entity.Student;
import ntu.example.ormdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// Todo show RequestMapping
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students")
    public @ResponseBody Iterable<Student> getAllStudents() {
        return studentService.findAll();
    }

}
