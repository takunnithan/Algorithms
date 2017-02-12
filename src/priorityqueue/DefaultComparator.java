package priorityqueue;

import java.util.Comparator;

/**
 * Created by takunnithan on 13-02-2017.
 */
public class DefaultComparator<E> implements Comparator<E> {

    @Override
    public int compare(E a, E b) {
        return ((Comparable<E>) a).compareTo(b);
    }
}
