package charstreams;

import java.io.*;

public class FileReading {

    public static void main(String[] args) {

        try(Reader reader = new FileReader("output.txt")) {
//            int ch;
//            while((ch=reader.read())!=-1){
//                System.out.print((char) ch);
//            }

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
