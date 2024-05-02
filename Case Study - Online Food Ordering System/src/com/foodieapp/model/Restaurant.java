package com.foodieapp.model;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public abstract class Restaurant {

    private long restaurantId;
    private String name;
    private CuisineType cuisineType;
    private String location;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private List<MenuItem> menuItems;
    private boolean isActive;


    // Getter Setter Constructor

}
