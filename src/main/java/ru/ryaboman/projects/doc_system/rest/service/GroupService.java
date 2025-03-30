package ru.ryaboman.projects.doc_system.rest.service;

import ru.ryaboman.projects.doc_system.rest.entity.Group;

import java.util.List;

public interface GroupService {
    List<Group> findAll();
}
