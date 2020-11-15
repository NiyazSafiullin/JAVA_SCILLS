package ru.safiullinnh.springboot.server.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.safiullinnh.springboot.server.demo.model.User;
import ru.safiullinnh.springboot.server.demo.repositories.UsersRepositiry;

@Controller
public class SignUpController {
   @Autowired
    private UsersRepositiry usersRepositiry;
    @GetMapping("/signup")
    public String SignUp () {
        return "signup_page";
    }
    @PostMapping("/signup")
    public String SignUpUser(User user) {
        usersRepositiry.save(user);
        return "redirect:/signup";
    }
}
