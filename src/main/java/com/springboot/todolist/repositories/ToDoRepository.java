package com.springboot.todolist.repositories;

import com.springboot.todolist.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
