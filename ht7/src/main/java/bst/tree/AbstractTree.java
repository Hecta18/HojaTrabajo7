package bst.tree;

public abstract class AbstractTree <E> implements TreeInterface {
    //static = can be used without creating an instance of the class
    protected static class Node<E> {
        //nested class, has benefits in this situation
        E element;
        Node<E> left;
        Node<E> right;

        public Node(E element) {
            this.element = element;
            left = null;
            right = null;
        }
    }
    //variables
    protected Node<E> root;

    //constructor
    protected AbstractTree() {
        root = null;
    }

    public abstract void insert(E element, Node<E> left, Node<E> right);
    public abstract boolean search(E element);
} 