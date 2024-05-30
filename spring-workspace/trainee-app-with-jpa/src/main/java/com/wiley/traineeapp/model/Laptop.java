package com.wiley.traineeapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}
