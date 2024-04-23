public class Bookstore {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add books to inventory
        inventory.addBook(new Book("Title 1", "Author 1", 19.99));
        inventory.addBook(new Book("Title 2", "Author 2", 24.99));

        // Add books to shopping cart
        shoppingCart.addItem(inventory.getBook(0)); // Assuming getBook(index) method is available
        shoppingCart.addItem(inventory.getBook(1));

        // Display inventory
        inventory.display();

        // Display total price of items in shopping cart
        System.out.println("Total price in shopping cart: " + shoppingCart.calculateTotalPrice());
    }
}
