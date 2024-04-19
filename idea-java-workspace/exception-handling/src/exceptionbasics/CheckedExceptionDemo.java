package exceptionbasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        File file = new File("hello.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}
