package bst.product;
import bst.tree.AbstractTree;
import bst.tree.BinarySearchTree;

public class ProductBST extends BinarySearchTree<Producto> {
    
    public Producto findProductBySKU(String sku, AbstractTree.Node<Producto> root) {
        return findRec(root, sku);
    }

    private Producto findRec(AbstractTree.Node<Producto> node, String sku) {
        if (node == null) {
            return null;
        }
        if (node.getElement().getSku().equals(sku)) {
            return node.getElement();
        }
        return sku.compareTo(node.getElement().getSku()) < 0 ? findRec(node.getLeft(), sku) : findRec(node.getRight(), sku);
    }
}
