package com.springboot.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

    @GetMapping("/")
    public ModelAndView todoView(){
        ModelAndView model = new ModelAndView("todoView");
        return model;
    }
}
