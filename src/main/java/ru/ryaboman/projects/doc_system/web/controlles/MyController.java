package ru.ryaboman.projects.doc_system.web.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ryaboman.projects.doc_system.rest.entity.Group;
import ru.ryaboman.projects.doc_system.rest.entity.User;
import ru.ryaboman.projects.doc_system.rest.service.GroupService;
import ru.ryaboman.projects.doc_system.rest.service.UserService;
import ru.ryaboman.projects.doc_system.rest.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private GroupService groupService;

    @RequestMapping("/users")
    public String showUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("allUsers", users);
        return "users";
    }

    @RequestMapping("/groups")
    public String showGroups(Model model) {
        List<Group> groups = groupService.findAll();
        model.addAttribute("allGroups", groups);
        return "groups";
    }
}
