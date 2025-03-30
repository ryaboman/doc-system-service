package ru.ryaboman.projects.doc_system.rest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ryaboman.projects.doc_system.rest.entity.Group;

import java.util.List;

@Repository
public class GroupDAOImpl implements GroupDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Group> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Group").list();
    }
}
