package com.todo.application.repository;

import com.todo.application.model.Task;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {

        public Task saveTask(Task task);

        public List<Task> getAllTasks();

        public Optional<Task> getTasksByTitle(String title);

        public Optional<Task> getTasksByID(int id);

        public Task updateTrainee(int id,Task task);
        public void deleteById(int id);
}
