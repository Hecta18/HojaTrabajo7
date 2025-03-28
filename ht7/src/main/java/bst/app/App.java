package bst.app;
import bst.product.*;

import java.util.List;

import bst.csvread.CsvRead;

public class App 
{
    public static void main( String[] args )
    {
        //Create BST out of CSV file
        List<List<String>> productos = CsvRead.csvToList("ht7/src/main/java/bst/files/Csv.csv");
        ProductBST bst = new ProductBST();
        for (List<String> producto : productos) {
            Producto p = new Producto(Integer.parseInt(producto.get(0)), Double.parseDouble(producto.get(1)), Double.parseDouble(producto.get(2)), producto.get(3), producto.get(4));
            bst.insert(p);
        }
        System.out.println(bst.findProductBySKU(50161485, bst.getRoot()));
    }
}
