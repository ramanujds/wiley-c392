package com.wiley.traineeapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "trainee_data")
@NamedQuery(name = "findByLocation", query = "from Trainee where location=:location")
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "trainee_name", length = 50)
    private String name;
    @Column(unique = true, length = 100, nullable = false)
    private String email;
    private String location;
    @Column(name = "joined_date")
    private LocalDate joinDate;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Laptop laptop;
}
