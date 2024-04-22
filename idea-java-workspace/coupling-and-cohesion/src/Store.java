public class Store {
    public static void main(String[] args) {
        // Create instances of Book, Inventory, and ShoppingCart
        ShoppingCart cart = new ShoppingCart();
        Inventory inventory = new Inventory();
        
        Product book1 = new Book("The Alchemist", "Paulo Coelho", 20.0);
        Product book2 = new Book("To Kill a Mockingbird", "Harper Lee", 15.0);
        
        // Add items to the inventory
        inventory.addProduct(book1);
        inventory.addProduct(book2);

        // Add items to the shopping cart

        cart.addItem(book1);
        cart.addItem(book2);
        
        // Display the items in the shopping cart
        inventory.displayInventory();
        
        // Calculate the total price of the items in the shopping cart
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}
