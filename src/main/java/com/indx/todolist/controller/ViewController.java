package com.indx.todolist.controller;

import com.indx.todolist.repository.TodoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ViewController {
    @NonNull
    TodoRepository repository;

    @GetMapping("/app")
    public String list(Model model) {
        model.addAttribute("list", repository.findAll());
        return "list";
    }
}
