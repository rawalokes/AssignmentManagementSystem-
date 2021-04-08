package utils;

import com.management.system.service.*;

public class ServiceFactory {
    public static StudentService getStudentService() {
        return new StudentServiceManger();
    }
    public static TeacherService getTeacherService() {
        return new TeacherServiceManager();
    }
    public static AssignmentService getAssignmentService() {

        return new AssignmentServiceManager();
    }
    public static SubmitService getSubmitService(){
        return new SubmitServiceManager();
    }




}