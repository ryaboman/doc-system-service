package ru.ryaboman.projects.doc_system.rest.dao;

import ru.ryaboman.projects.doc_system.rest.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> findAll();
}
