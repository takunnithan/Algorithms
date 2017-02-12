package priorityqueue;

import java.util.Comparator;

/**
 * Created by takunnithan on 13-02-2017.
 */
public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    protected static class PQEntry<K, V> implements Entry<K, V> {

        private K k;
        private V v;

        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }

    private Comparator<K> comparator;

    protected AbstractPriorityQueue(Comparator<K> c) {
        comparator = c;
    }

    protected AbstractPriorityQueue() {
        this(new DefaultComparator<K>());
    }

    protected int compare(Entry<K, V> a, Entry<K, V> b) {
        return comparator.compare(a.getKey(), b.getKey());
    }

    protected boolean checkKey(K key) {
        try {
            return (comparator.compare(key, key) == 0);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Incompatible key");
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}
