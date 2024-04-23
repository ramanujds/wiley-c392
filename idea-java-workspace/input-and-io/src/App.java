import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String option = "y";
        try (
                Scanner sc = new Scanner(System.in);
                RandomAccessFile file = new RandomAccessFile("output.txt", "rw")
        ) {
            // do {
            //     switch (option) {
            //         case "y":
            //             System.out.println("Enter text to be written - ");
            //             file.writeUTF(sc.next());
            //         default:
            //             System.out.println("Want to add more (y/n) : ");
            //             option = sc.next();
            //             break;
            //     }
            // } while (!option.equals("n"));
            while (file.getFilePointer() != file.length()) {
                System.out.print((char) file.read());

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
