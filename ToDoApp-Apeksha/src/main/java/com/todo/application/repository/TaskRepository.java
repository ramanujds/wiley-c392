package com.todo.application.repository;

import com.todo.application.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Integer> {

    @Query("from Task where status = true")
    public List<Task> findCompletedTasks();
    @Query(name = "findTaskByTitle")
    public Optional<Task> findTaskByTitle(String title);
}
