package com.todo.application.service;

import com.todo.application.dto.TaskDto;
import com.todo.application.exception.DuplicateEntryException;
import com.todo.application.exception.RecordNotFoundException;
import com.todo.application.model.Task;
import com.todo.application.repository.TaskRepository;
import com.todo.application.util.ToDoToUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoJpaServiceImpl implements ToDoService{
    private TaskRepository repository;

    @Autowired
    public ToDoJpaServiceImpl(TaskRepository repository){
        this.repository = repository;
    }
    public List<TaskDto> getAllTask() {
        return repository.findAll().parallelStream()
                .map(ToDoToUtil::convertToTaskDto).toList();
    }

    public TaskDto saveTask(TaskDto taskDto) {
        if(repository.existsById(taskDto.id()) || repository.equals(taskDto.title())){
            throw new DuplicateEntryException("title or ID already exists");
        }
        Task task = repository.save(ToDoToUtil.convertToTaskEntity(taskDto));
        return ToDoToUtil.convertToTaskDto(task);
    }

    public TaskDto getTasksByTitle(String title) {
        return repository.findTaskByTitle(title)
                .map(ToDoToUtil::convertToTaskDto)
                .orElse(null);
    }

    public TaskDto getTasksByID(int id) {
        return repository.findById(id).map(ToDoToUtil::convertToTaskDto)
                .orElseThrow(()->new RecordNotFoundException("Record with id "+id+" Not Found"));
    }

    public TaskDto updateTask(int id, TaskDto taskDto) {
        Task taskUpdate = repository.findById(id).orElseThrow(()->new RecordNotFoundException("Task with id" +id+" not found"));
        if(taskDto.title()!=null)taskUpdate.setTitle(taskDto.title());
        if(taskDto.title()!=null)taskUpdate.setDescription(taskDto.description());
        if(taskDto.title()!=null)taskUpdate.setStatus(taskDto.status());
        repository.save(taskUpdate);
        return ToDoToUtil.convertToTaskDto(taskUpdate);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public List<TaskDto> findCompletedTasks(){
        return repository.findCompletedTasks().parallelStream().map(ToDoToUtil::convertToTaskDto).toList();
    }
}
