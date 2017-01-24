package main.trees;

import main.trees.position.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by takunnithan on 12-11-2016.
 */
public abstract class AbstractTree<E> implements Tree<E>{

    @Override
    public boolean isExternal(Position p) throws IllegalArgumentException {
        return numChildren(p) > 0;
    }

    @Override
    public boolean isInternal(Position p) {
        return numChildren(p) < 0;
    }

    @Override
    public boolean isRoot(Position p) {
        return p == root();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public int depth(Position<E> p){
        if (isRoot(p)){
            return 0;
        }
        else {
            return 1 +  depth(p);
        }
    }

    public int height(Position<E> p){
        int h = 0;
        for(Position<E> c : children(p)){
            h = Math.max(h, 1+height(c));
        }
        return h;
    }

    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> postIterator = positions().iterator();
        public boolean hasNext(){ return postIterator.hasNext();}
        public E next(){return postIterator.next().getElement();}
        public void remove(){postIterator.remove();}
    }

    public Iterable<Position<E>> positions(){
        return preorder();
    }

    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot) {
        snapshot.add(p);
        for(Position<E> c : children(p)){
            preorderSubtree(c,snapshot);
        }
    }

    public Iterable<Position<E>> preorder(){
        List<Position<E>> snapshot = new ArrayList<Position<E>>();
        if(!isEmpty())
            preorderSubtree(root(), snapshot);
        return snapshot;
    }



}
