package bst.csvread;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 

public class CsvRead {
    public CsvRead() {
    // Empty constructor to hide the implicit public one.
    }
    // Read CSV file and return a list of strings
    public static List<List<String>> CsvToList(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String lineRaw;
            List<String> line = new ArrayList<String>();
            List<List<String>> lines = new ArrayList<>();
            while ((lineRaw = reader.readLine()) != null) {
                line = Arrays.asList(lineRaw.split(","));
                lines.add(trimLine(line));
                lineRaw = "";
                line.clear();                
            }
            reader.close();
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static List<String> trimLine(List<String> line) {
        for (int i = 0; i < line.size(); i++) {
            if (i==0 || i==6 || i==9 || i==10 || i==18) {
                line.remove(i);
            }
        }
        return line;
    }
}

