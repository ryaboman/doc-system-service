package ru.ryaboman.projects.doc_system.rest.service;

import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ryaboman.projects.doc_system.rest.dao.GroupDAO;
import ru.ryaboman.projects.doc_system.rest.entity.Group;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupDAO groupDAO;

    @Override
    @Transactional
    public List<Group> findAll() {
        return groupDAO.findAll();
    }
}
