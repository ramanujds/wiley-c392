public class Restaurant {

    private String RestaurantName;
    private String cuisinetype;
    private String Location;
    private boolean activeStatus;

    public Restaurant(String restaurantName, String cuisinetype, String location) {
        RestaurantName = restaurantName;
        this.cuisinetype = cuisinetype;
        Location = location;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public String getCuisinetype() {
        return cuisinetype;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public void setCuisinetype(String cuisinetype) {
        this.cuisinetype = cuisinetype;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
