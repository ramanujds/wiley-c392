public class Inventory {

    private List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public void display(){
        for(i:books){
            System.out.print("Authore: "+i.authore);
            System.out.print("Title: "+i.title);
            System.out.println("Price: "+i.price+"\'");
        }
    }

}
