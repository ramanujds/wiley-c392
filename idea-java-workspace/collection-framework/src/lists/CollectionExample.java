package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class CollectionExample {

    public static void main(String[] args) {

        Collection<Object> items = new ArrayList<>();

        items.add(100);
        items.add("Harsh");
        items.add(true);
        items.add(4.5);
        items.add(100);
        items.add(100);

        for (var item:items){
            System.out.println(item);
        }



    }

}
