package bst;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * funciones que deberia de tener la app:
 * -leer csvz
 * -input sku, output Price_Retail Price_Current Product_Name Category
 * -bst ordenado por sku
 * -insertar y buscar en treemap
 * -eliminar y buscar en treemap
 */
public class AppTest 
{
    @Test
    public void csvCreated()
    {
        // assertTrue( csv.notEmpty() );
        
    }

    @Test
    public void buscarPorSku()
    {
        // assertTrue( (Price_Retail, Price_Current, Product_Name, Category).equals(buscarPorSku()) );
    }

    @Test
    public void bstOrdenCorrecto()
    {
        // assertTrue(bst.ladoIzquierdo < bst.ladoDerecho);
    }

    @Test
    public void insertSearch()
    {
        // treemap.insert(product);
        // assertTrue(treemap.contains(product));
    }

    @Test
    public void deleteSearch()
    {
        // treemap.delete(product);
        // assertTrue(!treemap.contains(product));
    }
}
