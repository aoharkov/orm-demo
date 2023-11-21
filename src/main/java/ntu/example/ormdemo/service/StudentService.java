package ntu.example.ormdemo.service;

import ntu.example.ormdemo.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
}
