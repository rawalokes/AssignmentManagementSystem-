package com.management.system.service;

import java.util.List;

import com.management.system.model.Assignment;
import com.management.system.model.Student;
import com.management.system.repo.AssignmentRepo;
import com.management.system.repo.StudentRepo;
import com.management.system.repo.StudentRepoManager;
import com.management.system.repo.TeacherRepo;

public class StudentServiceManger implements StudentService{

    private StudentRepo studentRepo;
    private TeacherRepo teacherRepo;
    private AssignmentRepo assignmentRepo;
    public  StudentServiceManger() {
        this.studentRepo=new StudentRepoManager();
    }
    @Override
    public Boolean Search(String name) {
        this.studentRepo=new StudentRepoManager();
        return null;
    }
    @Override
    public Boolean register(Student student) {
        studentRepo.register(student);
        return true;
    }

    @Override
    public Boolean login(Student student) {

        this.studentRepo.login(student);
        return true;
    }


    @Override
    public Boolean submit(Assignment assignment) {
        this.assignmentRepo.add(assignment);
        return true;
    }
    @Override
    public List<Student> allStd() {
        return studentRepo.allStd();
    }

    @Override
    public Boolean delete(int id) {
        this.studentRepo.delete(id);
        return true;
    }

    @Override
    public Boolean getOneStd(int id) {
        this.studentRepo.getOneStudent(id);
        return true;
    }

}
