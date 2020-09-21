package com.example.todoapp.repository;

import com.example.todoapp.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<TodoEntity,Integer> {

    TodoEntity findByTitle(String title);
}
