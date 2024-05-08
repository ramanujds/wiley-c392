package streamapi;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> nums = List.of(-1, 2, -3, 5, -6, -7, 10);

        // filter - find all the positive numbers

        // map - double the elements

        List<Integer> output = nums.parallelStream().filter(e -> e > 0)
                                             .map(e -> e * e)
                                             .toList();

        System.out.println(output);

//        int output =
//        nums.stream().filter(e -> {
//                    System.out.println("Filtered " + e);
//                    return e > 0;
//                })
//                .map(e -> {
//                    System.out.println("Mapped " + e);
//                    return e * 2;
//                })
//                .findFirst().get();
//
////                .reduce(0,(sum,e)->sum+e);
//
//
//               System.out.println(output);


    }

}
