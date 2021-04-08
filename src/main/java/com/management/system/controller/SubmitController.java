package com.management.system.controller;

import com.google.gson.Gson;
import com.management.system.model.Submit;
import utils.ServiceFactory;

import static spark.Spark.post;

public class SubmitController {
    public static void submit(){
        post("/api/submit",(req,res)->{
            Submit submit=new Gson().fromJson(req.body(),Submit.class);
            return ServiceFactory.getSubmitService().add(submit);

        });
    }
}
