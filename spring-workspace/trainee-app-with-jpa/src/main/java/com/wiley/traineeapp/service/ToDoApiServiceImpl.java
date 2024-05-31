package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ToDoApiServiceImpl implements ToDoApiService{

    @Autowired
    private RestTemplate restTemplate;

    @Value("${TODO_API_URL}")
    private String baseUrl;

    @Override
    public ToDo fetchTodo(int id) {
       ToDo todo = restTemplate.getForObject(baseUrl+"/"+id,ToDo.class);
       return todo;
    }

    @Override
    public ToDo addNewTodo(ToDo todo) {
        ToDo savedTodo = restTemplate.postForObject(baseUrl,todo,ToDo.class);
        return savedTodo;
    }

    @Override
    public ToDo updateTodo(ToDo todo) {
        ToDo savedTodo = restTemplate.postForObject(baseUrl,todo,ToDo.class);
        return savedTodo;
    }

    @Override
    public void deleteTodo(int id) {
        restTemplate.delete(baseUrl+"/"+id);
    }

    @Override
    public List<ToDo> fetchAllTodos() {
        List<ToDo> todos = List.of(restTemplate.getForObject(baseUrl, ToDo[].class));
        return todos;
    }
}
