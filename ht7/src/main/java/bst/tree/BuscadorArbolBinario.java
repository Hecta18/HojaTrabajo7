package bst.tree;

public class BuscadorArbolBinario<E extends Comparable<E>> extends AbstractTree<E>{
    
    @Override
    public void insert(E element, Node<E> left, Node<E> right) {
        root = insertRec(root, element);
    }

    //verifica si es mayor a 0, si es asi lo inserta en la izquierda, si no lo inserta en la derecha
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void insert() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean search() {
        // TODO Auto-generated method stub
        return false;
    }

    public Node<E> insertRec(Node<E> node, E element) {
        if (node == null) {
            return new Node<>(element);
        }
        if (element.compareTo(node.element) < 0) {
            node.left = insertRec(node.left, element);
        } else if (element.compareTo(node.element) > 0) {
            node.right = insertRec(node.right, element);
        }
        return node;
    }

    //mira si el nodo es nulo, si es asi retorna falso, si no verifica si es igual al nodo, si es asi retorna verdadero
    @Override
    public boolean search(E element) {
        return searchRec(root, element);
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
