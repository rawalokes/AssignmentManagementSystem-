package com.management.system.repo;

import javax.persistence.EntityManager;

import com.management.system.model.Assignment;
import com.management.system.model.Teacher;
import org.hibernate.SessionFactory;

public class TeacherRepoManager  implements TeacherRepo{

    private SessionFactory sessionFactory;
    private EntityManager session;
    public TeacherRepoManager() {
        sessionFactory=utils.SessionFactory.getInstance();
    }

    @Override
    public Boolean register(Teacher teacher) {
        session = sessionFactory.createEntityManager();
        session.getTransaction().begin();
        session.persist(teacher);
        session.getTransaction().rollback();
        if (session.isOpen())
            session.close();
        return  true;
    }


    @Override
    public Boolean loginTeacher(Teacher teacher) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
        Teacher teach= (Teacher) session.createNamedQuery("loginTeacher",Teacher.class)
                .setParameter("name",teacher.getUsername()).getSingleResult();
        if (session.isOpen())
            session.close();
        if (teacher.getPassword().equals(teach.getPassword()))
            return  true;
        else
            return  false;
    }

    @Override
    public Boolean assign(Assignment assign) {
        // TODO Auto-generated method stub
        return null;
    }

}