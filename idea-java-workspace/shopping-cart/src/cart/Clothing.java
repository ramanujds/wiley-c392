package cart;


public class Clothing extends Product {
    Integer size;
    String material;
    public Clothing(String productName, Integer productId, Double price, Integer quantityInStock,Integer size, String material) {
        super(productName, productId, price, quantityInStock);
        this.size = size;
        this.material = material;
    }
}
