package main.trees.binarytree;

import main.trees.Tree;
import main.trees.position.Position;

/**
 * Created by takunnithan on 22-11-2016.
 */
public interface BinaryTree<E> extends Tree<E> {

    Position<E> left(Position<E> p) throws IllegalArgumentException;

    Position<E> right(Position<E> p) throws IllegalArgumentException;

    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
