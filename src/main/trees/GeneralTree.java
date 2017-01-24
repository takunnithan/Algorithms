package main.trees;

import main.trees.position.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by takunnithan on 25-01-2017.
 */
public class GeneralTree<E> extends AbstractTree<E> {

    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private List<Position<E>> children = new ArrayList<>();

        public Node(E e, Node<E> above){
            element = e;
            parent = above;
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

        public List<Position<E>> getChildren(){
            return children;
        }

        public void setChildren(Position<E> p){
            Node<E> node = (Node<E>) p;
            ((Node<E>) p).setParent(this);
            children.add(node);
        }

    }

    protected Node<E> root = null;
    private int size = 0;

    /**
     * Factory method for creating a node object
     * @param e element to be stored in the node
     * @param parent Parent of the node
     * @return  Instance of <B>Node</B>
     */
    public Node<E> createNode(E e, Position<E> parent){
        Node<E> p = (Node<E>) parent;
        return new Node<>(e, p);
    }

    @Override
    public Position<E> root() {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {

        Node<E> node = (Node<E>) p;
        return node.getParent();
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
        Node<E> node = (Node<E>) p;
        return node.getChildren();
    }

    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        Node<E> node = (Node<E>) p;
        return node.getChildren().size();
    }

    @Override
    public int size() {
        return size;
    }

    public Position<E> addRoot(E e){
        if(!isEmpty())
            throw new IllegalArgumentException("Tree is not empty");
        root =  createNode(e, null);
        size = 1;
        return root;
    }

    public void addChildren(Position<E> p, Position<E> children){
        Node<E> node = (Node<E>) p;
        ((Node<E>) p).setChildren(children);
    }

    public E getElement(Position<E> p){
        Node<E> node = (Node<E>) p;
        return node.getElement();
    }
}
