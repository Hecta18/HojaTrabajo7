package bst.csvread;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 

public class CsvRead {
    private CsvRead() {
    // Empty constructor to hide the implicit public one.
    // If not defined and made private, there is always a public constructor
    }
    // Read CSV file and return a list of strings
    public static List<List<String>> csvToList(String path) {
        //try with resources
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String lineRaw;
            List<String> line = new ArrayList<>();
            List<List<String>> lines = new ArrayList<>();
            while ((lineRaw = reader.readLine()) != null) {
                line = Arrays.asList(lineRaw.split(","));
                lines.add(trimLine(line));
                lineRaw = "";
                line.clear();                
            }
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static List<String> trimLine(List<String> line) {
        List<String> trimmedLine = new ArrayList<>();
        //modifying something while iterating is a bad practice
        //can lead to unexpected behavior
        for (int i = 0; i < line.size(); i++) {
            if (!(i == 0 || i == 6 || i == 9 || i == 10 || i == 18)) {
                trimmedLine.add(line.get(i));
            }
        }
        return trimmedLine;
    }
}

