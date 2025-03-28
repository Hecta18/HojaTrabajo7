package bst.product;
import bst.tree.AbstractTree;
import bst.tree.BinarySearchTree;

public class ProductBST extends BinarySearchTree<Producto> {
    
    public Producto findProductBySKU(int sku, AbstractTree.Node<Producto> root) {
        return findRec(root, sku);
    }

    private Producto findRec(AbstractTree.Node<Producto> node, int sku) {
        if (node == null) {
            return null;
        }
        if (node.getElement().getSku() == sku) {
            return node.getElement();
        }
        return Integer.compare(sku, node.getElement().getSku()) < 0 ? findRec(node.getLeft(), sku) : findRec(node.getRight(), sku);
    }
}
