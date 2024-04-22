
// Inventory class representing the inventory management component

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products= new ArrayList<>();

    // Methods related to inventory management

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductByTitle(String title) {
        for (Product product : products) {
            if (product.getProductTitle().equals(title)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findProductsByPriceRange(double minPrice, double maxPrice) {
        List<Product> productsByPriceRange = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductPrice() >= minPrice && product.getProductPrice() <= maxPrice) {
                productsByPriceRange.add(product);
            }
        }
        return productsByPriceRange;
    }

}