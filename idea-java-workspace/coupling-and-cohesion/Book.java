public class Book {
    private String title;
    private String authore;
    private double price;

    public Book(String title, String authore, double price) {
        this.title = title;
        this.authore = authore;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthore() {
        return authore;
    }

    public void setAuthore(String authore) {
        this.authore = authore;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
