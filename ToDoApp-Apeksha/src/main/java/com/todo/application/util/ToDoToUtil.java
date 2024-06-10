package com.todo.application.util;

import com.todo.application.dto.TaskDto;
import com.todo.application.model.Task;

public class ToDoToUtil {

    public static Task convertToTaskEntity(TaskDto taskDto){
        return new Task(taskDto.title(),taskDto.description(),taskDto.status());
    }

    public static TaskDto convertToTaskDto(Task task){
        return new TaskDto(task.getId(),task.getTitle(),task.getDescription(),task.isStatus());
    }
}
