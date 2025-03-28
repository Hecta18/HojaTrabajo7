package bst.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import bst.csvread.CsvRead;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la ruta del archivo
        System.out.println("Ingrese la ruta completa del archivo CSV:");
        String filePath = scanner.nextLine();

        // Leer el archivo CSV
        List<List<String>> data = CsvRead.csvToList(filePath);

        System.out.println("Ingrese el código SKU que desea buscar:");
        String inputSKU = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean found = false;

            // Leer la primera línea (encabezados) y omitirla
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > 6 && columns[6].equals(inputSKU)) {
                    System.out.println("Producto encontrado:");
                    System.out.println("SKU: " + columns[6]);
                    System.out.println("Price_Retail: " + columns[9]);
                    System.out.println("Price_Current: " + columns[10]);
                    System.out.println("Product_Name: " + columns[18]);
                    System.out.println("Category: " + columns[0]);
                    System.out.println("---------------------------");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No se encontraron productos con el SKU proporcionado.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}
