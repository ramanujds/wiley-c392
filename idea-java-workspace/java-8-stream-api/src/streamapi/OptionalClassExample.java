package streamapi;

import java.util.List;
import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        List<String> list = List.of("Harsh", "Rahul", "Javed", "Gaurav", "Riya");

        // searching for a name that starts with R

        String name = list.parallelStream().filter(e -> e.startsWith("R")).findAny()
                                    .orElseThrow(()->new RuntimeException("Not Found"));

        System.out.println(name);

        Optional<String> optionalString = Optional.empty();

        System.out.println(optionalString.isPresent());

    }

}
