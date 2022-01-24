package com.application.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.todoapp.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
