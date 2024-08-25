package com.indx.todolist.repository;

import com.indx.todolist.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TodoItem, Long> { }
