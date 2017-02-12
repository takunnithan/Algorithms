package priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by takunnithan on 13-02-2017.
 */
public class SortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private List<Entry<K, V>> list = new ArrayList<>();

    public SortedPriorityQueue() {
        super();
    }

    public SortedPriorityQueue(Comparator<K> comparator) {
        super(comparator);
    }

    @Override
    public int size() {
        return 0;
    }

    // Messed up logic!!!!!  Better have the List(ADT) implemented
    public Entry<K, V> insert(K key, V value) {
        checkKey(key);
        Entry<K, V> entry = new PQEntry<>(key, value);
        // Get the last item in the list
        Entry<K, V> walk = list.get(list.size() - 1);
        int nextIndex = 0;
        while (walk != null & compare(entry, walk) < 0) {
            // Get the index of the item before walk
             nextIndex = list.indexOf(walk) - 1;
            // Check if the index is not less than 0 to make sure no exception is thrown
            if(nextIndex < 0)
                walk = null;
            else
            // Update the walk as the item before walk
                walk = list.get(nextIndex);
        }
        if (nextIndex <= 0)
            list.add(0, entry);
        else

        // Need to move every item 1 index forward , then insert the entry to the position after walk
            list.add(nextIndex + 1, entry);

        return entry;
    }

    @Override
    public Entry<K, V> min() {
        return null;
    }

    @Override
    public Entry<K, V> removeMin() {
        return null;
    }


}
