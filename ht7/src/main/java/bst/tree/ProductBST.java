package bst.tree;

public class ProductBST extends BuscadorArbolBinario<ProductoRetail> {
    
    public ProductoRetail findProductBySKU(String sku) {
        return findRec(root, sku);
    }

    private ProductoRetail findRec(Node<ProductoRetail> node, String sku) {
        if (node == null) {
            return null;
        }
        if (node.element.getSku().equals(sku)) {
            return node.element;
        }
        return sku.compareTo(node.element.getSku()) < 0 ? findRec(node.left, sku) : findRec(node.right, sku);
    }
}
