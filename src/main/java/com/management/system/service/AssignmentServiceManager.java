package com.management.system.service;

import java.util.List;

import com.management.system.model.Assignment;
import com.management.system.repo.AssignmentRepo;
import com.management.system.repo.AssignmentRepoManager;


public class AssignmentServiceManager implements AssignmentService{

    private AssignmentRepo assignmentRepo;
    public AssignmentServiceManager() {
        this.assignmentRepo=new AssignmentRepoManager();
    }

    @Override
    public Boolean delete(int id) {
        this.assignmentRepo.delete(id);
        return true;
    }
    @Override
    public Boolean add(Assignment assignment) {
        assignmentRepo.add(assignment);
        return true;
    }

    @Override
    public List<Assignment> getall() {
        this.assignmentRepo.getAllAssignment();
        return null;

    }

}