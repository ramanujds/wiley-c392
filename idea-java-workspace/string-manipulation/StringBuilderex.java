import java.util.*;
public class StringBuilderex {
    public static void main(String[] args) {
        String stb="""
                This is example String
                It is to check the method""";
        System.out.println("No.of words: "+countWords(stb));
        System.out.println("No of lines: "+countLines(stb));
        System.out.println("Reverse of String: "+reverseText(stb));
        System.out.println("After removing duplicate: "+removeDuplicates(stb));

    }

    // Method to count words in the text
    private static int countWords(String text) {
        StringBuilder sb = new StringBuilder(text.trim());
        String[] words = sb.toString().split("\\s+");
        return words.length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        StringBuilder sb = new StringBuilder(text);
        String[] lines = sb.toString().split("\\n");
        return lines.length;

    }

    // Method to reverse the text
    private static String reverseText(String text) {
        StringBuilder sb=new StringBuilder(text);

        return sb.reverse().toString();

    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {

    }
}
