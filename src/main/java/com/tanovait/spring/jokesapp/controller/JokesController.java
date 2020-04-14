package com.tanovait.spring.jokesapp.controller;

import com.tanovait.spring.jokesapp.model.JokeModel;
import com.tanovait.spring.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    private JokeService service;

    public JokesController(JokeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    String getJoke(Model model){
       JokeModel parameterJoke =  new JokeModel();
       parameterJoke.setJoke(service.sayAJoke());
       model.addAttribute("joke",parameterJoke);
       // This is templates/jokes.html
       return "jokes";
    }
}
