package com.todo.application.controller;


import com.todo.application.dto.TaskDto;
import com.todo.application.service.ToDoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/api/v1/task/")
public class ToDoController {

        private ToDoService service;

        @Autowired
        public ToDoController(ToDoService service){
            this.service = service;
        }

        @PostMapping
        public ResponseEntity<TaskDto> saveTasks(@RequestBody @Valid TaskDto taskDto){
            TaskDto dto = service.saveTask(taskDto);
            if(dto != null){
                return new ResponseEntity<>(dto,HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        @GetMapping
        public ResponseEntity<List<TaskDto>> getAllTasks(){
            List<TaskDto> listOfTasks = service.getAllTask();
            if(listOfTasks.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(listOfTasks,HttpStatus.OK);
        }

        @GetMapping("/searchByTitle/{title}")
        public ResponseEntity<TaskDto> getTaskByTitle(@PathVariable String title){
            TaskDto taskDto = service.getTasksByTitle(title);
            if(taskDto == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(taskDto,HttpStatus.OK);
        }

        @GetMapping("/searchById/{id}")
        public ResponseEntity<TaskDto> getTaskById(@PathVariable int id){
            TaskDto taskDto = service.getTasksByID(id);
            if(taskDto == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(taskDto,HttpStatus.OK);
        }

        @PutMapping("/{id}")
        public ResponseEntity<TaskDto> updateTask(@PathVariable int id, @RequestBody @Valid TaskDto taskDto) {
            TaskDto updatedTask = service.updateTask(id, taskDto);
            System.out.println(updatedTask);
            if (updatedTask == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(updatedTask, HttpStatus.OK);
        }

        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.OK)
        public void deleteById(@PathVariable int id){
                service.deleteById(id);
        }


}
