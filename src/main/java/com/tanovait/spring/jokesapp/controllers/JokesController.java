package com.tanovait.spring.jokesapp.controllers;

import com.tanovait.spring.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService service;

    @Autowired
    public JokesController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    String getJoke(Model model) {
        model.addAttribute("joke", service.sayAJoke());
        // This is templates/jokes.html
        return "jokes";
    }
}
