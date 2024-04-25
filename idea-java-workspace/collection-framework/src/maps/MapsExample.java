package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    public static void main(String[] args) {

        Map<Integer, String> wordMap = new HashMap<>();

        wordMap.putIfAbsent(1,"One");
        wordMap.putIfAbsent(20,"Twenty");
        wordMap.putIfAbsent(3,"Three");
        wordMap.putIfAbsent(4,"Four");
        wordMap.putIfAbsent(10,"Ten");
        wordMap.putIfAbsent(4,"Four");
        wordMap.putIfAbsent(4,"Char");


        for (int key : wordMap.keySet()){
            System.out.println(wordMap.get(key));
        }

    }

}
