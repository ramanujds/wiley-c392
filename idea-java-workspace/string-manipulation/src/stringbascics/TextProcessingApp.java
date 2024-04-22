
package stringbascics;

import java.util.*;
import java.util.stream.Collectors;


public class TextProcessingApp {
    public static void main(String[] args) {

        String str = """
                The String class in Java represents a sequence of characters.
                Strings in Java are immutable, meaning their values cannot be changed after they are created. 
                This immutability ensures thread safety and allows strings to be used as constants.
                """;

//        System.out.println("Total words = "+countWords(str));
//        System.out.println("Lines = "+countLines(str));
//        System.out.println("Recersed = "+reverseText("harsh"));

        System.out.println("After Removing Duplicates - "+removeDuplicates(str));



    }

    // Method to count words in the text
    private static int countWords(String text) {
        return text.split("[\\s,]+").length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        return (int)text.lines().count();
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
      var strArr =  text.split("[\\s,]+");
      StringBuilder sb = new StringBuilder();

      for (String str:strArr){
          if(!sb.toString().toLowerCase().contains(str.toLowerCase())){
              sb.append(" ").append(str);
          }
      }

     return sb.toString();

    }
}


