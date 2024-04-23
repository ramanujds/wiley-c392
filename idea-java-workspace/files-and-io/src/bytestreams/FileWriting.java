package bytestreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriting {
    public static void main(String[] args) {

        try(OutputStream outputStream = new FileOutputStream("output.txt")) {
            String line = "Hello world, java file handling is simple and easy";
            outputStream.write(line.getBytes());
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }


    }
}
