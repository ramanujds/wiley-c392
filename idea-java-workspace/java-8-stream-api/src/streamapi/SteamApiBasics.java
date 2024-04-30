package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamApiBasics {

    public static void main(String[] args) {
        List<String> names = List.of("Harsh Kumar", "Virat Kohli", "Mahendra Singh Dhoni", "Akash", "Karan Chopra");

//        List<String> validNames = getValidNames(names);
//
//        List<String> shortNames = getShortNames(validNames);
//
//
//        String allNames = getAllNames(shortNames);
//        System.out.println(allNames);


        String output = names.stream().filter(name -> name.strip().contains(" "))
                .map(name -> name.split(" ")[0])
                .collect(Collectors.joining(", "));

        System.out.println(output);


    }

//    {
//        StringBuilder sb = new StringBuilder();
//        for (String str : name.split(" ")) {
//            sb.append(str.charAt(0));
//        }
//        return sb.toString();
//    })

//    static List<String> getValidNames(List<String> names) {
//        List<String> validNames = new ArrayList<>();
//        names.forEach(name -> {
//            if (name.strip().contains(" ")) {
//                validNames.add(name);
//            }
//        });
//        return validNames;
//    }
//
//    static List<String> getShortNames(List<String> names) {
//        List<String> shortNames = new ArrayList<>();
//        for (var name : names) {
//            String shortName = "";
//            for (String str : name.split(" ")) {
//                shortName += str.charAt(0);
//            }
//            shortNames.add(shortName);
//        }
//        return shortNames;
//    }
//
//    public static String getAllNames(List<String> list){
//        StringBuilder s = new StringBuilder();
//
//        for(int i=0;i<list.size();i++){
//            s.append(list.get(i));
//            if(i<list.size()-1){
//                s.append(",");
//            }
//        }
//        return s.toString();
//    }


}


