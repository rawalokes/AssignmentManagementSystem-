package com.management.system.controller;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.management.system.model.Student;
import utils.ServiceFactory;

//public static void login() {
//		post("api/user/login",(req,res)->{
//		User user=new Gson().fromJson(req.body(), User.class);
//		return ServiceFactory.getUserService().checkUser(user);
//		});
//		}
public class StudentController {
    public static void delete(){
        post("/api/delete/:id",(req,res)->{
            int id=Integer.parseInt(req.params("id"));
            return ServiceFactory.getStudentService().delete(id);
        });
    }
    public static void loginStudent() {
        post("/api/loginStudent",(req,res)->{
            Student student=new Gson().fromJson(req.body(),Student.class);
            //return StudentLoginFactory.getLoginService().login(student);
            return ServiceFactory.getStudentService().login(student);
        });
    }

    private static void SearchStudentByname() {
        post("/api/searchStd",(req,res)->{
            String name= req.params("name");
            return ServiceFactory.getStudentService().Search(name);
        } );

    }


    private static void registerStudent() {
        post("/api/registerStd",(req,res)->{
            Student student=new Gson().fromJson(req.body(),Student.class);
            return ServiceFactory.getStudentService().register(student);
        });
    }

    public static void getall() {
        get("/api/allstd",(req,res)->{
            return new Gson().toJson(ServiceFactory.getStudentService().allStd());
        });
    }
    public static void initStudentController() {
        registerStudent();
        SearchStudentByname();
        loginStudent();
        getall();
    }

}