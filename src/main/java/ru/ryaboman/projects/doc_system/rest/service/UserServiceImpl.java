package ru.ryaboman.projects.doc_system.rest.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ryaboman.projects.doc_system.rest.dao.UserDAO;
import ru.ryaboman.projects.doc_system.rest.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
