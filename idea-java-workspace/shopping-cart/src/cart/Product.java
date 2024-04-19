package cart;

public class Product {
    String productName;
    Integer productId;
    Double price;
    Integer quantityInStock = 0;

    public Product(String productName, Integer productId, Double price, Integer quantityInStock) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = this.quantityInStock++;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product Id : " + productId + " Product Name : " + productName + " " + " Product Price "
                + price + " Quantity : " + quantityInStock);
    }

    @Override
    public String toString() {
        return "{ \"productName\": \"" + productName + "\", \"productId\": " + productId + ", \"price\": " + price
                + ", \"quantityInStock\": " + quantityInStock + " }";
    }
}
