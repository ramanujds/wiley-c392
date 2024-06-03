import java.util.HashMap;
import java.util.Map;

public class EmailClassifier {

    public static void main(String[] args) {
        // Sample list of email IDs
        String[] emails = {"user1@gmail.com", "user2@yahoo.com", "user3@hotmail.com", "user4@outlook.com", "user5@example.com"};

        // Initialize a map to store domain name and corresponding emails
        Map<String, StringBuilder> domainMap = new HashMap<>();

        // Classify emails
        for (String email : emails) {
            String domain = getEmailDomain(email);
            domainMap.putIfAbsent(domain, new StringBuilder());
            domainMap.get(domain).append(email).append("\n");
        }

        // Print the result
        for (Map.Entry<String, StringBuilder> entry : domainMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    }

    // Helper method to extract domain from email
    private static String getEmailDomain(String email) {
        String[] parts = email.split("@");
        if (parts.length == 2) {
            return parts[1];
        }
        return ""; // return empty string if unable to extract domain
    }
}
