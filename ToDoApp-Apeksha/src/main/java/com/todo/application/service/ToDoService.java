package com.todo.application.service;

import com.todo.application.dto.TaskDto;
import com.todo.application.model.Task;

import java.util.List;
import java.util.Optional;

public interface ToDoService {

    public List<TaskDto> getAllTask();

    public TaskDto saveTask(TaskDto taskDto);

    TaskDto getTasksByTitle(String title);

    public TaskDto getTasksByID(int id);

    public TaskDto updateTask(int id,TaskDto taskDto);

    public void deleteById(int id);

    public List<TaskDto> findCompletedTasks();
}
