package com.management.system.repo;

import com.management.system.model.Submit;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class SubmitRepoManager implements SubmitRepo{
    private SessionFactory sessionFactory;
    private EntityManager session;
    @Override
    public Boolean add(Submit submit) {
        session=sessionFactory.createEntityManager();
        session.getTransaction().begin();
        session.persist(submit);
        session.getTransaction().commit();
        if (session.isOpen())
            session.close();
    return true;
    }
}
