package bst.tree;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E>{
    //This ensures that the elements stored in the tree can be compared to each other.
    private AbstractTree.Node<E> root;

    public AbstractTree.Node<E> getRoot() {
        return root;
    }
    
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
            return false; 
        } else {
            return searchRec(root, element);
        } 
    }

    public boolean searchRec(Node<E> root, E element) {
        if (element.equals(root.getElement())) {
            return true;
        } else {
            if (element.compareTo(root.getElement()) <= 0) {
                searchRec(root.getLeft(), element);
            }  else if (element.compareTo(root.getElement()) > 0) {
                searchRec(root.getRight(), element);
            }
            return false;
        }
    }
}
