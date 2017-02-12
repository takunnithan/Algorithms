package priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by takunnithan on 13-02-2017.
 */
public class UnsortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private List<Entry<K, V>> list = new ArrayList<>();

    public UnsortedPriorityQueue() {
        super();
    }

    public UnsortedPriorityQueue(Comparator<K> comparator) {
        super(comparator);
    }

    private Entry<K, V> findMin() {
        Entry<K, V> small = list.get(0);
        for (Entry<K, V> walk : list) {
            if (compare(walk, small) < 0)
                small = walk;
        }
        return small;
    }

    public Entry<K, V> insert(K key, V value) {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        list.add(newest);
        return newest;
    }

    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;
        return findMin();
    }

    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;
        Entry<K, V> min = findMin();
        list.remove(min);
        return min;
    }

    public int size() {
        return list.size();
    }

}
