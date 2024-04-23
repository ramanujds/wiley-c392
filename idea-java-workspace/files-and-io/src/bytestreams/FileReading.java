package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReading {

    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("Readme.md")) {
            int ch;
            while((ch=inputStream.read())!=-1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
