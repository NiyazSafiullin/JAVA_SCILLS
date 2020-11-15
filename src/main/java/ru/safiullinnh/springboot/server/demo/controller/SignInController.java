package ru.safiullinnh.springboot.server.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/signin")
    public String getSignInPage() {
        return "signin_page";
    }
}
