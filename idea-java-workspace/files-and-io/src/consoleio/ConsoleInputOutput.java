package consoleio;

import java.io.Console;

public class ConsoleInputOutput {

    public static void main(String[] args) {

        Console console = System.console();
        if (console !=null) {
            console.printf("Enter input : ");
            String input = console.readLine();
            System.out.println(input);
        }

    }

}
