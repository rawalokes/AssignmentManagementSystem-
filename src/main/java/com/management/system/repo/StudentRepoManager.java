package com.management.system.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;

import com.management.system.model.Assignment;
import com.management.system.model.Student;

public class StudentRepoManager implements StudentRepo {


    private SessionFactory sessionFactory;
    private EntityManager session;
    private AssignmentRepo assignmentRepo;

    public StudentRepoManager() {
        sessionFactory=utils.SessionFactory.getInstance();
    }
    @Override
    public Student Search(String name) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
//		Student student=session.createNamedQuery("findStudentByUsername",Student.class).setParameter("id",id).getResultList();
        Student student=session.find(Student.class,name);
        session.getTransaction().commit();
        if(session.isOpen())
            session.close();
        return student;
    }



    @Override
    public Boolean register(Student student) {
        session =sessionFactory.createEntityManager();
        session.getTransaction().begin();
        session.persist(student);
        session.getTransaction().commit();
        if(session.isOpen())
            session.close();
        return true;
    }
    @Override
    public List<Student> allStd() {
        session= sessionFactory.createEntityManager();
        session.getTransaction().begin();
        List<Student> student=session.createQuery("from Student",Student.class).getResultList();
        session.getTransaction().commit();
        if(session.isOpen()) {
            session.close();}
        return student;

    }

    @Override
    public Student getOneStudent(int id) {
        session= sessionFactory.createEntityManager();
        session.getTransaction().begin();
        Student student=session.find(Student.class,id);
        session.getTransaction().commit();
        if (session.isOpen())
            session.close();
        return  student;
    }

    @Override
    public Boolean delete(int id) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
        Student std=session.find(Student.class,id);
        session.remove(std);
        session.getTransaction().commit();
        if (session.isOpen())
            session.close();
        return  true;
    }

    @Override
    public  Boolean login(Student student) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
        Student std=(Student) session.createNamedQuery("findStudentByUsername",Student.class)
                .setParameter("name", student.getUsername()).getSingleResult();
        session.getTransaction().commit();
        if(session.isOpen()) {
            session.close();
        }
        if(student.getPassword().equals(std.getPassword())) {
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Boolean submit(Assignment assignment) {

        return null;
    }


}