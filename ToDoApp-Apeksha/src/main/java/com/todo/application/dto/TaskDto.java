package com.todo.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

public record TaskDto(int id,
                      @Size(min = 1,max = 100, message = "Title must be between 1 and 100 characters")
                      @NotNull(message = "title cannot be null") String title,
                      @NotNull(message = "description must have data") String description,
                      boolean status) {
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
