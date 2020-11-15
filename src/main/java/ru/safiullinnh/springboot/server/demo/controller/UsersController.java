package ru.safiullinnh.springboot.server.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.safiullinnh.springboot.server.demo.model.User;
import ru.safiullinnh.springboot.server.demo.repositories.UsersRepositiry;

import java.util.List;

@Controller

public class UsersController {

    @Autowired
    private UsersRepositiry usersRepositiry;

    @GetMapping("/users")
    public String getUsersPage(Model model) {
       List<User> users=usersRepositiry.findAll();
       model.addAttribute("users",users);
        return "user_page";
    }
}
