package main.trees.binarytree;

import main.trees.position.Position;

/**
 * Created by takunnithan on 11/25/16.
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    protected static class Node<E> implements Position<E>{
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild){
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }

        @Override
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }

    /**
     * Factory method for creating a node object
     * @param e element to be stored in the node
     * @param parent Parent of the node
     * @param left Left child of the node
     * @param right Right child of the node
     * @return  Instance of <B>Node</B>
     */
    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right){
        return new Node(e, parent, left, right);
    }

    protected Node<E> root = null;
    private int size = 0;

    public LinkedBinaryTree(){}

    /**
     * validate a position in the tree
     * @param p position to be validated
     * @return Validated node
     */
    protected Node<E> validate(Position<E> p){
        if(!(p instanceof Node))
            throw new IllegalArgumentException("Not a valide position type");
        Node<E> node = (Node<E>) p;
        if(node.getParent() == node)
            throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }

    public int size(){
        return size;
    }

    public Position<E> root(){
        return root;
    }

    public Position<E> parent(Position<E> p){
        Node<E> node = validate(p);
        return node.getParent();
    }

    public Position<E> left(Position<E> p){
        Node<E> node = validate(p);
        return node.getLeft();
    }

    public Position<E> right(Position<E> p){
        Node<E> node = validate(p);
        return node.getRight();
    }

    public Position<E> addRoot(E e){
        if(!isEmpty())
            throw new IllegalArgumentException("Tree is not empty");
        root =  createNode(e, null, null, null);
        size = 1;
        return root;
    }











}
