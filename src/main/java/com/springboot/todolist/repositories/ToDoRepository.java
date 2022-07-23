package com.springboot.todolist.repositories;

import com.springboot.todolist.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
