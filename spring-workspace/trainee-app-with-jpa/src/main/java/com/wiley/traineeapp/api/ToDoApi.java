package com.wiley.traineeapp.api;

import com.wiley.traineeapp.dto.ToDo;
import com.wiley.traineeapp.service.ToDoApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoApi {

    @Autowired
    private ToDoApiService toDoApiService;

    @GetMapping
    public List<ToDo> fetchAllToDos(){
        return toDoApiService.fetchAllTodos();
    }

}
