package com.todo.application.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

@Data
@Entity
@Table(name = "Task_Data")
@NamedQuery(name = "findTaskByTitle",query = "from Task where title = :title")
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_ID")
    private int id;

    @Column(name = "task_title",length = 50,unique = true)
    private String title;

    @Column(name = "task_description",length = 100,nullable = false)
    private String description;

    private boolean status;

    public Task(String title,String description,boolean status){
        this.title = title;
        this.description = description;
        this.status = status;
    }
}
