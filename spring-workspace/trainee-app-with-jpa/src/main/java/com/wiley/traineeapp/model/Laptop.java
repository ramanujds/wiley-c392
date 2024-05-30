package com.wiley.traineeapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "laptop_data")
public class Laptop {
    @Id
    private int id;
    @Column(length = 50)
    private String brand;
    @Column(length = 50)
    private String model;
    private float price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    Trainee trainee;
}
