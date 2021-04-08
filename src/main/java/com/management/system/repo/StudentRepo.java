package com.management.system.repo;

import java.util.List;

import com.management.system.model.Assignment;
import com.management.system.model.Student;

public interface StudentRepo {
    Student Search(String name);
    Boolean register(Student student);
    Boolean login(Student student);
    Boolean submit(Assignment assignment);
    List<Student> allStd();
    Student getOneStudent(int id);
    Boolean delete(int id);

}