package streamapi;

import java.util.List;
import java.util.stream.Stream;

public class StreamsMore {

    public static void main(String[] args) {

        // Creating Streams

        List<Integer> list = List.of(5,10,15,20,25);

        list.stream().forEach(e-> System.out.println(e));

        list.stream().forEach(e-> System.out.println(e));


    }

}
