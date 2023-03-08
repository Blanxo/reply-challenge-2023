package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List readFileRows(String filePath) {
        try {
            Path path = Paths.get(filePath);
            List<String> rows = new ArrayList<>();
            rows.addAll(Files.readAllLines(path));
            return rows;
        } catch (IOException exception) {
            return null;
        }
    }
}
