package com.foodieapp.repository;

import com.foodieapp.model.CuisineType;
import com.foodieapp.model.MenuItem;
import com.foodieapp.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    public void addRestaurant(Restaurant restaurant);

    public void setActivationStatus(boolean status);

    public void updateMenuItem(MenuItem item);

    public Restaurant getRestaurantById(long id);

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public List<Restaurant> findAllDeactivatedRestaurant();


}
