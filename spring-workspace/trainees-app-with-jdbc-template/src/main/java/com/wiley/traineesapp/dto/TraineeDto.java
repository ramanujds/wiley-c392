package com.wiley.traineesapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record TraineeDto(int id, @NotBlank(message = "Name is required") String name, @Email(message = "Invalid Email") String email, @NotBlank(message = "Location is Required") String location, @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate joinDate) {
    public TraineeDto(int id, String name, String email, String location){
        this(id,name,email,location,LocalDate.now());
    }
}
