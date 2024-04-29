package generics;

import java.util.List;

public class GenericsWithWildCards{

    // Upper Bound
    public static double sum(List<? extends Number> numbers){
       var sum = 0.0;
       for (var n:numbers){
           sum += n.doubleValue();
       }
       return sum;
    }

    // Lower Bound
    public static double addNum(List<? super Double> numbers){
        var sum = 0;
        for (var n:numbers){
            sum += (int)n;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(addNum(List.of(10,10,20)));
    }



}
