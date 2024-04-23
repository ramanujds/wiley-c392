package filehandlingwithnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FieReadingNIO {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Readme.md");
        Files.lines(path).filter(line -> line.contains("Java")).forEach(System.out::println);

        List<String> names = List.of("Java", "Python", "JavaScript");

        names.forEach((StringBuilder::new));

    }

}
