package com.todo.application.service;

import com.todo.application.dto.TaskDto;
import com.todo.application.exception.RecordNotFoundException;
import com.todo.application.model.Task;
import com.todo.application.repository.ToDoRepository;
import com.todo.application.repository.ToDoRepositoryImpl;
import com.todo.application.util.ToDoToUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class ToDoServiceImpl implements ToDoService{

    private ToDoRepository repository;

    public ToDoServiceImpl(ToDoRepository repository){
        this.repository=repository;
    }


    public List<TaskDto> getAllTask() {
        return repository.getAllTasks().parallelStream().map(ToDoToUtil::convertToTaskDto).toList();
    }

    @Override
    public TaskDto saveTask(TaskDto taskDto) {
        Task task = repository.saveTask(ToDoToUtil.convertToTaskEntity(taskDto));
        return ToDoToUtil.convertToTaskDto(task);
    }

    public TaskDto getTasksByTitle(String title){
        return repository.getTasksByTitle(title).map(ToDoToUtil::convertToTaskDto)
                .orElseThrow(()->new RecordNotFoundException("Record with title "+title+" not found"));
    }

    public TaskDto getTasksByID(int id) {
        return repository.getTasksByID(id).map(ToDoToUtil::convertToTaskDto).orElse(null);
    }

    public TaskDto updateTask(int id,TaskDto taskDto){
        Task task = repository.updateTrainee(id,ToDoToUtil.convertToTaskEntity(taskDto));
        return ToDoToUtil.convertToTaskDto(task);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }

    @Override
    public List<TaskDto> findCompletedTasks() {
        return null;
    }
}
