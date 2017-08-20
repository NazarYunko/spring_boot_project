package com.spring_boot_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("userName", principal.getName());
        }
        return "home";
    }

    @PostMapping("/")
    public String homePageAfterLogin() {
        return "redirect:/";
    }
}
