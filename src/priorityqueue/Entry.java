package priorityqueue;

/**
 * Created by takunnithan on 13-02-2017.
 */
public interface Entry<K, V> {
    K getKey();

    V getValue();
}
