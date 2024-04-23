package charstreams;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) {

        try(Writer writer = new FileWriter("output.txt")) {
            String line = "\nAre we ready??";
            writer.append(line).append("Bye");
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }


    }
}
