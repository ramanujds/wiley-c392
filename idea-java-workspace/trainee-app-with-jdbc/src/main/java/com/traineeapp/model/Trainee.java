package com.traineeapp.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Trainee {
    private int id;
    private String traineeName;
    private String email;
    private String location;
    private int laptopId;
    private LocalDate dob;
    private int teamLead;

    public Trainee(String traineeName, String email, String location, LocalDate dob) {
        this.traineeName = traineeName;
        this.email = email;
        this.location = location;
        this.dob = dob;
    }
}
