package emailparsing;

import java.util.*;

public class EmailParsing {
    public static void main(String[] args) {
        String str = "harsh@yahoo.com, naman@yahoo.com, karan@gmail.com, ram@yahoo.com, viswa@tech.in, viswa@tech.in, deepak@outlook.com";


        String[] emails = str.split(",");
        Map<String, List<String>> map = new HashMap<>();

        for(String email: emails) {
            email = email.strip();
            String domain = email.substring(email.indexOf('@')+1);
            List<String> set = map.getOrDefault(domain, new ArrayList<>());
            set.add(email);
            map.put(domain, set);
        }

        for(String domain: map.keySet())
        {
            System.out.printf("%-30s",domain);
        }
        System.out.println();
        System.out.println("-".repeat(100));

        List<List<String>> emailsList = new ArrayList<>(map.values());


        for(int i=0; i<3; i++){
            for (List<String> strings : emailsList) {
                String email = i < strings.size() ? strings.get(i) : "";
                System.out.printf("%-30s", email);
            }
            System.out.println();

        }

    }
}
