package com.management.system.controller;
import static spark.Spark.*;

import com.google.gson.Gson;

import com.management.system.model.Assignment;
import utils.ServiceFactory;

public class AssignmentController {
    public static  void getall(){
        post("/api/getallassignment",(req,res)->{
            return new Gson().toJson(ServiceFactory.getAssignmentService().getall());
        });
    }
    private static void add() {
        post("/api/a",(req,res)->{
            Assignment assignment=new Gson().fromJson(req.body(),Assignment.class);
            return ServiceFactory.getAssignmentService().add(assignment);
        });
    }
    private static void deleteById() {
        delete("/api/deleteAssign/:id",(req,res)->{
            int id=Integer.parseInt(req.params("id"));
            System.out.print(id);

            return ServiceFactory.getAssignmentService().delete(id);
        });
    }
    public static void initAssignmentController() {
        add();
        deleteById();
        getall();
    }

}