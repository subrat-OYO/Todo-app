package com.example.todoapp.service;

import com.example.todoapp.entity.TodoEntity;
import com.example.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService  {
    
    @Autowired
    private TodoRepository repository;



    public ResponseEntity<ArrayList<TodoEntity>> getAll(){
        ArrayList<TodoEntity> list = new ArrayList<>();

        repository.findAll().forEach(list::add);

        return ResponseEntity.ok().body(list);
    }

    public ResponseEntity<TodoEntity> getById( int id){

        return ResponseEntity.ok().body(repository.findById(id).get());

    }


    public ResponseEntity<TodoEntity> getByTitle( String title){

        return ResponseEntity.ok().body( repository.findByTitle(title));

    }

    public ResponseEntity<String > create( TodoEntity todoEntity){
        repository.save(todoEntity);
        return ResponseEntity.ok().body("task created");
    }

    public ResponseEntity<String > update( TodoEntity updatedTodoEntity,  int id){
        repository.save(updatedTodoEntity);
        return ResponseEntity.ok().body("task updated");
    }

    public ResponseEntity<String > delete( int id){
        repository.deleteById(id);
        return ResponseEntity.ok().body("task deleted");
    }

}
