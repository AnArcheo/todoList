package com.springboot.todolist.controllers;

import com.springboot.todolist.model.ToDo;
import com.springboot.todolist.repositories.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class TodoController {


    private ToDoRepository toDoRepository;

    public TodoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


//    public Set<ToDo> findAllTodos(){
//        Set<ToDo> todoSet = new HashSet<>();
//        toDoRepository.findAll().iterator().forEachRemaining(todoSet::add);
//        return todoSet;
//    }

    @RequestMapping({"", "/"})
    public String getTodoViewPage(Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todoView";
    }
//    @GetMapping("/")
//    public String todoView(){
//        ModelAndView model = new ModelAndView("todoView");
//        return "todoView";
//    }
}
