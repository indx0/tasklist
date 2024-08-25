package com.indx.todolist.controller;

import com.indx.todolist.entity.TodoItem;
import com.indx.todolist.repository.TodoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TodoController {
    @NonNull
    TodoRepository repository;

    @GetMapping("/getAll")
    Iterable<TodoItem> getAll() {
        return repository.findAll();
    }

    @GetMapping("/getById/{id}")
    Optional<TodoItem> getById(@PathVariable long id) {
        return repository.findById(id);
    }

    @PostMapping("/createItem")
    TodoItem createItem(@RequestBody TodoItem item) {
        return repository.save(item);
    }

    @DeleteMapping("/deleteItem/{id}")
    void deleteItem(@PathVariable long id) {
        repository.deleteById(id);
    }
}
