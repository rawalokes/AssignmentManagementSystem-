package com.management.system.service;

import com.management.system.model.Assignment;
import com.management.system.model.Teacher;
import com.management.system.repo.TeacherRepo;
import com.management.system.repo.TeacherRepoManager;

public class TeacherServiceManager implements TeacherService{

    private TeacherRepo teacherRepo;

    public TeacherServiceManager() {
        this.teacherRepo =new TeacherRepoManager();
    }

    @Override
    public Boolean register(Teacher teacher) {

        return this.teacherRepo.register(teacher);
    }

    @Override
    public Boolean login(Teacher teacher) {
        this.teacherRepo.loginTeacher(teacher);
        return null;
    }



    @Override
    public Boolean add(Assignment assign) {

        return null;
    }



}