package main.trees.binarytree;

import javafx.geometry.Pos;
import main.trees.AbstractTree;
import main.trees.position.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by takunnithan on 22-11-2016.
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E>{

    public Position<E> sibling(Position<E> p){
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

    public Iterable<main.trees.position.Position<E>> children(Position<E> p){
        List<main.trees.position.Position<E>> snapshot = new ArrayList<main.trees.position.Position<E>>(2);
        if(left(p) != null)
            snapshot.add(left(p));

        if(right(p) != null)
            snapshot.add(right(p));

        return snapshot;
    }

    private void inorderSubtree(Position<E> p, List<Position<E>> snapshot){
        if(left(p) != null)
            inorderSubtree(left(p), snapshot);
        snapshot.add(p);
        if(right(p) != null)
            inorderSubtree(right(p), snapshot);
    }

    public Iterable<Position<E>> inorderTraversal(){
        List<Position<E>> snapshot = new ArrayList<>();
        if(!isEmpty())
            inorderSubtree(root(), snapshot);
        return snapshot;
    }

    // To make inorder the default traversal for binary tree.
    @Override
    public Iterable<Position<E>> positions() {
        return inorderTraversal();
    }
}
