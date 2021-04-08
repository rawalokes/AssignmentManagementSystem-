package com.management.system.controller;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.management.system.model.ErrorRes;
import com.management.system.model.Teacher;
import utils.ServiceFactory;
import static spark.Spark.*;
public class TeacherController {


    public static void register(){

        post("/api/register", (req, res) -> {
            Teacher teacher;
            try {
                teacher = new Gson().fromJson(req.body(), Teacher.class);
            }catch (JsonParseException exception){
                res.status(400);
                exception.printStackTrace();
                return false;
            }
            if(teacher==null && teacher.getPassword()==null&& teacher.getUsername()==null){
                res.status(400);
//                return new Gson().toJson(new ErrorRes(400,"Not valid"));
            }

            return ServiceFactory.getTeacherService().register(teacher);

        });
    }
    public  static void loginTeacher(){
        post("/api/login",(req,res)->{
            Teacher teacher=new Gson().fromJson(req.body(),Teacher.class);
            return ServiceFactory.getTeacherService().login(teacher);
        });
    }

    public static void initTeacherController() {
        register();
        loginTeacher();
    }
}