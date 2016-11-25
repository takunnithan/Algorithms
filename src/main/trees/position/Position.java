package main.trees.position;

/**
 * Created by takunnithan on 11/25/16.
 */
public interface Position<E> {

    E getElement() throws IllegalStateException;
}
