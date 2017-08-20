package com.spring_boot_project.controller;

import com.spring_boot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/failurelogin")
    public String failureLogin() {
        return "redirect:/failurelogin";
    }

    @GetMapping("/failurelogin")
    public String failureLoginPage(Model model) {
        model.addAttribute("userException", "Login or password is wrong");
        return "login";
    }

    @PostMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}
