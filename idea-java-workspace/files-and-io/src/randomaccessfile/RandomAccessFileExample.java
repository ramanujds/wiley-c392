package randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("output.txt","rw")){
            file.writeUTF("Hello, we are using RandomAccessFile");
            file.writeUTF("\nIt's easy and simple");

            file.seek(0);

            String content = file.readUTF();
            System.out.println(content);
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

}
