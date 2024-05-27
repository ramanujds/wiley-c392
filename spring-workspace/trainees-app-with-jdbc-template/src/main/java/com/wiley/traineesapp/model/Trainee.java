package com.wiley.traineesapp.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Trainee {


    private int id;
    @NotBlank(message = "Blank Not Allowed")
    private String name;
    private String email;
    private String location;

    public Trainee(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }
}
