package com.management.system.service;

import java.util.List;

import com.management.system.model.Assignment;
import com.management.system.model.Student;

public interface StudentService {
    Boolean Search(String name);
    Boolean register(Student student);
    Boolean login(Student student);
    Boolean submit(Assignment assig);
    List<Student> allStd();
    Boolean delete(int id);
    Boolean getOneStd(int id);

}