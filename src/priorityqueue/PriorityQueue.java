package priorityqueue;

/**
 * Created by takunnithan on 13-02-2017.
 */
public interface PriorityQueue<K, V> {
    int size();

    boolean isEmpty();

    Entry<K, V> insert(K key, V value);

    Entry<K, V> min();

    Entry<K, V> removeMin();
}
