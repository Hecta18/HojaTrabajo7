package bst.tree;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E>{
    //This ensures that the elements stored in the tree can be compared to each other.
    private AbstractTree.Node<E> root;

    @Override
    public void insert(E element) {
        if (root == null) {
            root = new AbstractTree.Node<>(element);
            root.setLeft(null);
            root.setRight(null); 
        } else {
            insertRec(root, element);
        }    
    }

    //insertar recursivamente, chequeando nodo por nodo
    //mira si el nodo es nulo, si es asi crea un nuevo nodo con el elemento
    //si no es nulo, compara el elemento con el nodo actual
    // si es menor se va a la izquierda y mayor derecha
    public Node<E> insertRec(AbstractTree.Node<E> root, E element) {
        if (element.compareTo(root.getElement()) < 0) {
            //menor a raiz
            root.setLeft(insertRec(root.getLeft(), element));
        } else if (element.compareTo(root.getElement()) > 0) {
            //mayor a raiz
            root.setRight(insertRec(root.getRight(), element));
        }
        return root;
    }
    
    @Override
    public boolean search(E element) {
        if (root == null) {
            root = new AbstractTree.Node<>(element);
            root.setLeft(null);
            root.setRight(null); 
        } else {
            insertRec(root, element);
        }  
    }

    public boolean searchRec(Node<E> node, E element) {
        if (node == null) {
            return false;
        }
        if (element.equals(node.element)) {
            return true;
        }
        return element.compareTo(node.element) < 0 ? searchRec(node.left, element) : searchRec(node.right, element);
    }

    public Node<E> deleteRec(Node<E> node, E element) {
        if (node == null) {
            return null;
        }
        if (element.compareTo(node.element) < 0) {
            node.left = deleteRec(node.left, element);
        } else if (element.compareTo(node.element) > 0) {
            node.right = deleteRec(node.right, element);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            node.element = minValue(node.right);
            node.right = deleteRec(node.right, node.element);
        }
        return node;
    }

    public E minValue(Node<E> node) {
        E minValue = node.element;
        while (node.left != null) {
            minValue = node.left.element;
            node = node.left;
        }
        return minValue;
    }

    
}
