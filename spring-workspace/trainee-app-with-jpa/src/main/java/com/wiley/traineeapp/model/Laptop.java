package com.wiley.traineeapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
