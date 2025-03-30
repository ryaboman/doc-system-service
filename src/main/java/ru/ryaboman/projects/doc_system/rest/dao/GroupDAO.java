package ru.ryaboman.projects.doc_system.rest.dao;

import ru.ryaboman.projects.doc_system.rest.entity.Group;

import java.util.List;

public interface GroupDAO {
    List<Group> findAll();
}
