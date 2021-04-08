package com.management.system.repo;

import com.management.system.model.Assignment;
import com.management.system.model.Teacher;

public interface TeacherRepo {
    Boolean register(Teacher teacher);
    Boolean loginTeacher(Teacher teacher);
    Boolean assign(Assignment assign);

}