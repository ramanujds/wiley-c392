package com.wiley.traineeapp.service;

import com.wiley.traineeapp.dto.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ToDoApiService {


    public ToDo fetchTodo(int id);

    public ToDo addNewTodo (ToDo todo);

    public ToDo updateTodo (ToDo todo);

    public void deleteTodo (int id);

    public List<ToDo> fetchAllTodos();



}
