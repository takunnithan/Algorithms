package main.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by takunnithan on 12-11-2016.
 */
public class Position<E> implements Iterable<E>{

    List<Position<E>> positions = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return new PositionIterator<>(positions);
    }
}
