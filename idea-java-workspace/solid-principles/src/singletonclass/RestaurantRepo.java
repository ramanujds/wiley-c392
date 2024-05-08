package singletonclass;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepo {

    private List<String> restaurants;

    private static RestaurantRepo repo;

    private RestaurantRepo(){
        restaurants = new ArrayList<>();
    }

    public void addRestaurant(String name){
        restaurants.add(name);
    }

    public List<String> getRestaurants(){
        return restaurants;
    }

    public static RestaurantRepo getRestaurantRepo(){

        if(repo ==null ) repo = new RestaurantRepo();
        return repo;
    }

}
