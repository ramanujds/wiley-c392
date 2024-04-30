package functionalinterfaceandlambda;

import java.util.*;

public class LambdaWithCollection {

    static int count = 0;

    public static void main(String[] args) {

        List <String> names = new ArrayList<>(List.of("Javed","Lokesh","Karan","Mohit","Pooja"));



        List <String> namesUpper = new ArrayList<>();

        Map<Integer,String> namesMap = new HashMap<>(Map.of(1,"Javed",2,"Lokesh",3,"Karan",4,"Mohit",5,"Pooja"));

//        for (var name:names){
//            System.out.println(name);
//        }



        names.forEach(a-> {count++;});

        namesMap.forEach((k,v)-> System.out.println(k+" : "+v));

//        for (int key:namesMap.keySet()){
//            System.out.println(key+" : "+namesMap.get(key));
//        }




    }

    }


