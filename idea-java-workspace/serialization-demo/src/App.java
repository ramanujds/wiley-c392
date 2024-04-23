import cart.Product;
import cart.Electronics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import cart.Clothing;
import cart.ShoppingCart;
public class App {
    public static void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
             objectOutputStream.writeObject(object);
        }
        catch (IOException ex){
            System.err.println(ex);
        }
 
     }


    public static Object deSerializeObject(String filename){
        try(InputStream inputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product product1=new Clothing("Jeans",123,500.0,50,36,"Cotton");
        Product product2=new Electronics("TV", 654, 650000.0, 5, "Sony", "6 months");
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        serializeObject(shoppingCart);

        
    }
}
