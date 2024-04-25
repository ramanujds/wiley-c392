import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPaser {
    HashMap<String,ArrayList<String>> emailDomainsMap = new HashMap<>();
    public HashMap<String, ArrayList<String>> getEmailDomainsMap() {
        return emailDomainsMap;
    }
    public void parseEmails() {
        try (FileReader fr = new FileReader("/home/munshi/Documents/Programs/Work/Wiley Edge Java Training/wiley-c392/idea-java-workspace/email-parsing/src/emails.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                Pattern domainPattern = Pattern.compile("@\\w+\\.\\w+");
                Matcher matcher = domainPattern.matcher(line);
                while (matcher.find()) {
                    String domain = matcher.group().substring(1);
                    domain = domain.substring(0, 1).toUpperCase() + domain.substring(1);
                    if(emailDomainsMap.containsKey(domain)){
                        emailDomainsMap.get(domain).add(line);
                    }else{
                        ArrayList<String> emails = new ArrayList<>();
                        emails.add(line);
                        emailDomainsMap.put(domain,emails);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayEmailDomains() {
        for (String domain : emailDomainsMap.keySet()) {
            System.out.printf("%-30s",domain);
        }
        System.out.println();
        System.out.println("-".repeat(emailDomainsMap.size()*30));
        Set<String> keys = emailDomainsMap.keySet();
        for (int i=0;i<emailDomainsMap.size();i++) {
            int maxNumberOfEmails=0;
            for(String key:keys)
            {
                Integer numberOfEmails = emailDomainsMap.get(key).size();
                if(maxNumberOfEmails<numberOfEmails){
                    maxNumberOfEmails=numberOfEmails;
                }
            }

            int index=0;
            while (index<maxNumberOfEmails) {
                for(String key:keys)
                {
                    ArrayList<String> emails = emailDomainsMap.get(key);
                    if(index<emails.size()){
                        System.out.printf("%-30s",emails.get(index));
                    }else{
                        System.out.printf("%-30s","");
                    }
                }
                System.out.println();
                index++;
                
            }


        }

    }
}
