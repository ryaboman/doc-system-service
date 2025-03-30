package ru.ryaboman.projects.doc_system.rest.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ryaboman.projects.doc_system.rest.entity.Designator;
import ru.ryaboman.projects.doc_system.rest.entity.Morpheme;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Designator.class)
                .addAnnotatedClass(Morpheme.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Morpheme morpheme = new Morpheme("195-10", 8, timestamp);

            Designator designator = new Designator(5, 7);
            designator.setPrefix(morpheme);
            designator.setPostfix(morpheme);

            //session.save(designator);
            session.persist(designator);
            //session.delete(morpheme);
            session.getTransaction().commit();

            System.out.println(designator);
        }
    }
}
