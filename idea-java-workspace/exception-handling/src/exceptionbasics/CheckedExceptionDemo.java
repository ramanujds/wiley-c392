package exceptionbasics;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) {


        try (
                FileInputStream inputStream = new FileInputStream("hello.txt");
                Scanner scanner = new Scanner(inputStream);
                FileOutputStream outputStream = new FileOutputStream("test.txt");
        ) {

            String line = scanner.nextLine();
            System.out.println(line);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
