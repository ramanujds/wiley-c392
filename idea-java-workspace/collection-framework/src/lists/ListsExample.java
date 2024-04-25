package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>(List.of("Apple","Orange","Mango","Grapes"));

        fruits.remove("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }



    }

}
