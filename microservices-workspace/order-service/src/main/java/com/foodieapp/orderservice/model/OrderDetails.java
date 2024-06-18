package com.foodieapp.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@Table(name = "order_details")
public class OrderDetails {

    @Id
    private String orderId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MenuItem> item= new ArrayList<>();

    private double totalAmount;

    private String status;

}
