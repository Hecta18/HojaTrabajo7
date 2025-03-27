package bst.tree;

public abstract class AbstractTree <E> implements TreeInterface {
    //static = can be used without creating an instance of the class
    public static class Node<E> {
        //nested class, has benefits in this situation
        private E element;
        private Node<E> left;
        private Node<E> right;

        public Node(E element) {
            this.element = element;
            left = null;
            right = null;
        }
        //setters
        protected void setLeft(Node<E> left) {
            this.left = left;
        }

        protected void setRight(Node<E> right) {
            this.right = right;
        }

        //getters
        public E getElement() {
            return element;
        }

        public Node<E> getLeft() {
            return left;
        }

        public Node<E> getRight() {
            return right;
        }
    }

    //constructor
    protected AbstractTree() {}

    public abstract void insert(E element);
    public abstract boolean search(E element);
} 