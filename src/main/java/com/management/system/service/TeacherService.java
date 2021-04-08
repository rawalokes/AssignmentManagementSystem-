package com.management.system.service;

import com.management.system.model.Assignment;
import com.management.system.model.Teacher;

public interface TeacherService {

    Boolean register(Teacher teacher);
    Boolean login(Teacher teacher);
    Boolean add(Assignment assign);

}