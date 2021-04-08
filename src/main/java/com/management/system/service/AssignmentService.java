package com.management.system.service;

import java.util.List;

import com.management.system.model.Assignment;

public interface AssignmentService {
    Boolean add(Assignment assignment);
    List<Assignment> getall();
    Boolean delete(int id);


}