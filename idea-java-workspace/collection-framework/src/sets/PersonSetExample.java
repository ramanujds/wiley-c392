package sets;

import model.Person;

import java.util.HashSet;
import java.util.Set;

public class PersonSetExample {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Karan",26));
        personSet.add(new Person("Mahesh",26));
        personSet.add(new Person("Karan",26));
        personSet.add(new Person("Javed",28));

        for(var person:personSet){
            System.out.println(person);
        }

    }
}
