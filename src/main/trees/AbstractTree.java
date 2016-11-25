package main.trees;

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


}
