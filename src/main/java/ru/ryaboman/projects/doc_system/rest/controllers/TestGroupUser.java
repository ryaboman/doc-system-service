package ru.ryaboman.projects.doc_system.rest.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ryaboman.projects.doc_system.rest.entity.Group;
import ru.ryaboman.projects.doc_system.rest.entity.User;

import java.util.List;

public class TestGroupUser {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Group.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            List<User> userlist = session.createQuery("from User").list();

//            User user1 = session.get(User.class, 3);
//            User user2 = session.get(User.class, 7);
//            User user3 = session.get(User.class, 14);
//            User user4 = session.get(User.class, 13);
//
//            Group group = new Group("Walas", 2, "Работики");
//            group.addUser(user1);
//            group.addUser(user2);
//            group.addUser(user3);
//            group.addUser(user4);

//            session.persist(group);
            //session.delete(group);
            session.getTransaction().commit();

            System.out.println(userlist);
        }
    }
}
