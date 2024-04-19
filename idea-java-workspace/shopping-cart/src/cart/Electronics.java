
package cart;

public class Electronics extends Product {

    String brand;
    String warrantyPeriod;
    public Electronics(String productName, Integer productId, Double price, Integer quantityInStock ,String brand, String warrantyPeriod) {
        super(productName, productId, price, quantityInStock);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    
    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", brand='" + brand + '\'' +
                ", warrantyPeriod='" + warrantyPeriod + '\'' +
                '}';
    }
}
