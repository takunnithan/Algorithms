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


    }
}
