package com.management.system;
import com.management.system.controller.*;
import utils.SessionFactory;

import static spark.Spark.*;

public class Entry {

    public static void main(String[] args) {

        port(1234);

        String projectDir = System.getProperty("user.dir");
        String staticDir = "/src/main/resources/public";
        staticFiles.externalLocation(projectDir + staticDir);

        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request
                    .headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                        accessControlRequestHeaders); }

            String accessControlRequestMethod = request
                    .headers("Access-Control-Request-Method"); if (accessControlRequestMethod !=
                    null) { response.header("Access-Control-Allow-Methods",
                    accessControlRequestMethod); }

            return "OK"; });

        before((request, response) -> response.header("Access-Control-Allow-Origin",
                "*"));

        SessionFactory.getInstance();
        ImageController.uploadImage();
        SubmitController.submit();
        AssignmentController.initAssignmentController();
        StudentController.initStudentController();
        TeacherController.initTeacherController();
        System.out.println("test");

    }

}