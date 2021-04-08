package com.management.system.repo;

import java.util.List;
import javax.persistence.EntityManager;
import com.management.system.model.Assignment;

public class AssignmentRepoManager implements AssignmentRepo {

    private org.hibernate.SessionFactory sessionFactory;
    private EntityManager session;
    public AssignmentRepoManager() {
        sessionFactory= utils.SessionFactory.getInstance();
    }




    @Override
    public Boolean add(Assignment assignment) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
        session.persist(assignment);
        session.getTransaction().commit();
        if(session.isOpen())
            session.close();

        return true;
    }
    @Override
    public Boolean delete(int id) {
        session = sessionFactory.createEntityManager();
        session.getTransaction().begin();
        Assignment assignment = session.find(Assignment.class, id);
        session.remove(assignment);
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
        return true;
    }

    @Override
    public List<Assignment> getAllAssignment() {
        session =sessionFactory.createEntityManager();
        session.getTransaction().begin();
        List<Assignment> allAssignment=session.createQuery("from Assignment ",Assignment.class).getResultList();
        session.getTransaction().commit();
        if (session.isOpen())
            session.close();
        return null;
    }


}