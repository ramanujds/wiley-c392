package com.todo.application.repository;

import com.todo.application.exception.RecordNotFoundException;
import com.todo.application.model.Task;
import com.todo.application.util.TaskRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository{

    private JdbcTemplate template;
    private static final List<Task> taskList = new ArrayList<>();

    public ToDoRepositoryImpl(JdbcTemplate template){
        this.template = template;
    }

    public Task saveTask(Task task){
        int rowCount = template.update("insert into task(title,description,status) values(?,?,?)",
                task.getTitle(),task.getDescription(),task.isStatus());
        if(rowCount>0){
            return getTasksByTitle(task.getTitle()).get();
        }
        return null;
    }

    public Optional<Task> getTasksByTitle(String title){
        Task task = template.queryForObject("select * from Task where title = ?",new TaskRowMapper(),title);
        if(task == null){
                throw new RecordNotFoundException("Task with title : "+title+" not found");
        }
        return Optional.of(task);
    }
    public List<Task> getAllTasks() {
        return template.query("select * from task",new TaskRowMapper());
    }

    public Optional<Task> getTasksByID(int id){
        Task task = template.queryForObject("select * from Task where id = ?",new TaskRowMapper(),id);
        if(task == null){
            throw new RecordNotFoundException("Task with title : "+id+" not found");
        }
        return Optional.of(task);
    }

    public Task updateTrainee(int id, Task task) {
        int updatedTask = template.update("update Task set title = ?,description = ?, status = ? where id = ?",
                task.getTitle(),task.getDescription(),task.isStatus(),id);
        if(updatedTask>0){
            return task;
        }
        return null;
    }

    public void deleteById(int id){
        getTasksByID(id).ifPresent(t->template.update("delete from task where id =?",id));
    }
}
