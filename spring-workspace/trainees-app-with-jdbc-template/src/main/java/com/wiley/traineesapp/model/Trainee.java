package com.wiley.traineesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Trainee {

    private int id;
    private String name;
    private String email;
    private String location;

    public Trainee(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }
}
