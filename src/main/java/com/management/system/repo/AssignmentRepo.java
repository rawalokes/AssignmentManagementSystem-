package com.management.system.repo;

import java.util.List;

import com.management.system.model.Assignment;

public interface AssignmentRepo {
    Boolean add(Assignment assignment);
    List<Assignment> getAllAssignment();
    Boolean delete(int id);


}