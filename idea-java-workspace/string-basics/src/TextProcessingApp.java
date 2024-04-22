import java.util.*;

public class TextProcessingApp {
    // Method to count words in the text
    public static int countWords(String text) {
        String[] words=text.split(" ");
        return words.length;
    }

    // Method to count lines in the text
    public static int countLines(String text) {
        String[] lines=text.split("\n");
        return lines.length;
    }

    // Method to reverse the text
    public static String reverseText(String text) {
        StringBuilder sb=new StringBuilder(text);
        return sb.reverse().toString();
        
    }

    // Method to remove duplicate words from the text
    public static String removeDuplicates(String text) {
        String[] words=text.split(" ");
        HashSet<String> hs=new HashSet<>();
        for(String s:words)
        hs.add(s);
        String res="";
        for(String s:hs)
        res+=s+" ";
        return res;
    }
}