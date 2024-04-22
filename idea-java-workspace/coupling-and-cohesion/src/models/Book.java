// Book class representing a book entity
public class Book implements Product{
    private String title;
    private String author;
    private double price;

    // Constructor, getters, setters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String getProductTitle() {
        return title;
    }
    @Override
    public double getProductPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }   
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}

