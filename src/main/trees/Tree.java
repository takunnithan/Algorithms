package main.trees;

import java.util.Iterator;
import main.trees.position.Position;

/**
 * Created by takunnithan on 12-11-2016.
 */
public interface Tree<E>{

    Position<E> root();

    Position<E> parent(Position<E> p) throws IllegalArgumentException;

    Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;

    int numChildren(Position<E> p) throws IllegalArgumentException;

    boolean isExternal(main.trees.position.Position p) throws IllegalArgumentException;

    boolean isInternal(Position<E> p) throws IllegalArgumentException;

    boolean isRoot(Position<E> p) throws IllegalArgumentException;

    int size();

    boolean isEmpty();

//    Iterator<E> iterator();

//    Iterable<Position<E>> positions();

}
