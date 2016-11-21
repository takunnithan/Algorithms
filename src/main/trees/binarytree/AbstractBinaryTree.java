package main.trees.binarytree;

import main.trees.AbstractTree;
import main.trees.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by takunnithan on 22-11-2016.
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree implements BinaryTree{

    public Position<E> sibing(Position<E> p){
        Position<E> parent = parent(p);

        if(parent == null)
            return null;

        if(p == left(parent))
            return right(parent);
        else
            return left(parent);
        }

    public int numChildren(Position<E> p){
        int count = 0;
        if(left(p) != null)
            count++;
        if(right(p) != null)
            count++;
        return count;
    }

    public Iterable<Position<E>> children(Position<E> p){
        List<Position<E>> snapshot = new ArrayList<>(2);
        if(left(p) != null)
            snapshot.add(left(p));

        if(right(p) != null)
            snapshot.add(right(p));

        return snapshot;
    }





}
