**Coupling** refers to the degree of interdependence between classes in a software system. Low coupling means that classes are independent and changes in one class do not significantly affect others. High coupling indicates strong interdependence between classes, making the system less maintainable and more prone to errors.

**Cohesion** refers to the degree to which the elements within a class belong together and are focused on a single task. High cohesion means that elements of the class are strongly related and focused on a single task. Low cohesion indicates that the elements within the class are not closely related or have multiple unrelated responsibilities.

Let's create classes representing different components of the bookstore management system:

```java
// Book class representing a book entity
public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor, getters, setters
}

// Inventory class representing the inventory management component
public class Inventory {
    private List<Book> books;
}

// ShoppingCart class representing the shopping cart component
public class ShoppingCart {
    private List<Book> items;

    // Methods related to shopping cart
}

// Bookstore class representing the main application
public class Bookstore {
    public static void main(String[] args) {
        // Create instances of Book, Inventory, and ShoppingCart

        // Add books to inventory

        // Add books to shopping cart

        // Display inventory and total price of items in shopping cart
     
    }
}
```

