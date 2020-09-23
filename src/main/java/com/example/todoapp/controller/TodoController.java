package com.example.todoapp.controller;

import com.example.todoapp.entity.TodoEntity;
import com.example.todoapp.repository.TodoRepository;
import com.example.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/todo/api")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public String home(){
        return "welcome to featureX home...";
    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<TodoEntity>> allTask(){

        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<TodoEntity> getTask(@PathVariable int id){

        return service.getById(id);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<TodoEntity> getTask(@PathVariable String title){

        return service.getByTitle(title);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createTask(@RequestBody TodoEntity task){
        return service.create(task);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTask(@RequestBody TodoEntity updatedTask, @PathVariable int id){
        return service.update(updatedTask,id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable int id){
        return service.delete(id);
    }


}
