package main.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by takunnithan on 22-11-2016.
 */
public class PositionIterator<E> implements Iterator {

    List<Position<E>> positions = new ArrayList<>();

    private int counter = 0;

    public PositionIterator(List<Position<E>> positions){
        this.positions = positions;
    }

    @Override
    public boolean hasNext() {
        return counter > 0;
    }

    @Override
    public Object next() {
        counter++;
        return positions.get(counter);
    }
}
