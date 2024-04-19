package exceptionbasics;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream inputStream = new FileInputStream("hello.txt");
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);

//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }


    }

}
