package main.trees.binarytree;

import main.trees.Position;
import main.trees.Tree;

/**
 * Created by takunnithan on 22-11-2016.
 */
public interface BinaryTree<E> extends Tree {

    Position<E> left(Position<E> p) throws IllegalArgumentException;

    Position<E> right(Position<E> p) throws IllegalArgumentException;

    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
