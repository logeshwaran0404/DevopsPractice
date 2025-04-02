package com.mobicomm.controller;

import com.mobicomm.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", new Message("Welcome to Jenkins Spring Boot Pipeline!"));
        return "home";
    }
    
    @PostMapping("/submit")
    public String submitMessage(@ModelAttribute Message message, Model model) {
        model.addAttribute("message", message);
        return "home";
    }
}
