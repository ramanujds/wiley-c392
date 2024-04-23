package filehandlingwithnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingDirectories {

    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("src");
        Files.walk(directory).forEach(System.out::println);
    }
}
