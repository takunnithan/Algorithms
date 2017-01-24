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
        private List<Position<E>> childern = new ArrayList<>();

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

        public List<Position<E>> getChildern(){
            return childern;
        }

        public void setChildern(Position<E> p){
            Node<E> node = (Node<E>) p;
            ((Node<E>) p).setParent(this);
            childern.add(node);
        }

    }

    protected Node<E> root = null;
    private int size = 0;

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
        return node.getChildern();
    }

    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        return ;
    }

    @Override
    public int size() {
        return 0;
    }
}
