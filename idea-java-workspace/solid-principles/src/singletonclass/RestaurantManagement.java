package singletonclass;

public class RestaurantManagement {

    public static void main(String[] args) {

        RestaurantRepo repo1 = RestaurantRepo.getRestaurantRepo();

        repo1.addRestaurant("KFC");
        repo1.addRestaurant("Tasty");
        repo1.addRestaurant("Rameshwaram Cafe");

        RestaurantRepo repo2 = RestaurantRepo.getRestaurantRepo();

        repo2.getRestaurants().forEach(System.out::println);


    }

}
