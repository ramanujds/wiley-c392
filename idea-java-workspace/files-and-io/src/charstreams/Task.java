package charstreams;

import java.io.*;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String opt,str="";

        do {
            try (Writer writ = new FileWriter("tsk.txt")) {

                System.out.println("enter the text you want to write into the file: ");
                str=sc.next();
                writ.append(str);
                System.out.println("Written");
            } catch (IOException e) {
                System.out.println("Error in file writing");
            }
            System.out.println("Do you want to continue::\n Yes:y NO:n");
            opt = sc.next();
        }
        while(opt.equals("y"));
        System.out.println("The File Content::");
        try(Reader rd=new FileReader("tsk.txt")){
            BufferedReader bufferedReader = new BufferedReader(rd);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                //System.out.println("Reading....");
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in reading");
        } catch (IOException e) {
            System.out.println("Error in reading");
        }
    }
}
