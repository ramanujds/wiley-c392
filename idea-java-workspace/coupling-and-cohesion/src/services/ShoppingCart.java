// ShoppingCart class representing the shopping cart component

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> items= new ArrayList<>();

    // Methods related to shopping cart
    
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(Product item : items) {
            totalPrice += item.getProductPrice();
        }
        return totalPrice;
        
    }
    
    public void addItem(Product product) {
        items.add(product);
    }
    
    public void removeItem(Product product) {
        items.remove(product);
    }
    
    public void displayItems() {
        for(Product item : items) {
            System.out.println(item);
        }        
    }
    
    
    
}