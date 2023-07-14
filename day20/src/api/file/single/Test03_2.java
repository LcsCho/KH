package api.file.single;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test03_2 {
    public static void main(String[] args) throws IOException {
        Files.copy(Path.of("C:/Temp/origin.txt"), Path.of("./sample/copy.txt"));
    }
}