package ru.ryaboman.projects.doc_system.rest.service;

import ru.ryaboman.projects.doc_system.rest.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
