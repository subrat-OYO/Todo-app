package com.example.todoapp;

import com.example.todoapp.controller.TodoController;
import com.example.todoapp.entity.TodoEntity;
import com.example.todoapp.repository.TodoRepository;
import com.example.todoapp.service.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
class TodoAppApplicationTests {



    @Mock
    TodoController controller;



    @Test
    void contextLoads() {

        assertEquals("welcome home...",controller.home());
        //assertEquals("task deleted",service.delete(1));
    }

}
