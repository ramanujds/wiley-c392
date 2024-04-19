package cart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getProductId().equals(product.getProductId())) {
                throw new CustomProductException(" Product with Duplicate Id found");
            }
        }
        products.add(product);
    }

    public void display() {
        System.out.println(products);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            // System.out.print("\033[H\033[2J"); // Clear the console screen
            // System.out.flush();
            System.out.println("1. Add Electronic product in cart");
            System.out.println("2. Add Clothing product in cart");
            System.out.println("3. Display products in cart ");

            Integer option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(
                            "Enter product name, product id, product price, quantity in stock, brand, warranty period");
                    Product electronicsProduct = new Electronics(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(),
                            sc.next(), sc.next());
                    cart.addProduct(electronicsProduct);
                    break;
                case 2:
                    System.out.println(
                            "Enter product name, product id, product price, quantity in stock, size, material");
                    Product clothingProduct = new Clothing(sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(),
                            sc.nextInt(), sc.next());
                    cart.addProduct(clothingProduct);
                    break;
                case 3:
                    cart.display();
                    break;
                default:
                    break;
            }
        }
    }
}
