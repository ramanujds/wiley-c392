package com.foodieapp.repository;

import com.foodieapp.model.CuisineType;
import com.foodieapp.model.FastFoodRestaurant;
import com.foodieapp.model.MenuItem;
import com.foodieapp.model.Restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRepositoryImpl implements RestaurantRepository{

    private Map<Long,Restaurant> restaurants;

    public RestaurantRepositoryImpl(){
        restaurants = new HashMap<>();
        init();
    }

    public void init(){
        Restaurant restaurant1 = new FastFoodRestaurant();

    }

    public void addRestaurant(Restaurant restaurant) {

    }

    public void setActivationStatus(boolean status) {

    }

    public void updateMenuItem(MenuItem item) {

    }

    public Restaurant getRestaurantById(long id) {
        return null;
    }

    public List<Restaurant> findRestaurantByLocation(String location) {
        return List.of();
    }

    public List<Restaurant> findRestaurantByName(String name) {
        return List.of();
    }

    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return List.of();
    }

    public List<Restaurant> findAllActiveRestaurant() {
        return List.of();
    }

    public List<Restaurant> findAllDeactivatedRestaurant() {
        return List.of();
    }
}
