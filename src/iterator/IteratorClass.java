package iterator;

import java.util.Iterator;

/**
 * Created by takunnithan on 08-01-2017.
 */
public class IteratorClass implements Iterable<User> {

    private static final User[] EMPTY_LIST = {};

    int initialCursor = 0;

    User[] userList = EMPTY_LIST;

    UserIterator userIterator = new UserIterator();

    public IteratorClass(){}

    public IteratorClass(int size){
        this.userList = new User[size];
    }

    @Override
    public Iterator<User> iterator() {
        return userIterator;
    }

    public void add(User user){
        userIterator.add(user);
    }

    class UserIterator implements Iterator<User>{

        int size = 0;
        int cursor = 0;
        int internalCursor = 0;

        @Override
        public boolean hasNext() {
            if(internalCursor <= size) {
                return true;
            }
            else
                return false;
        }

        @Override
        public User next() {
            internalCursor ++;
            return userList[internalCursor - 1];
        }

        public void add(User user){
            if (cursor <= 0){
                userList[initialCursor] = user;
            }
            else{
                userList[cursor] = user;
            }
            cursor ++;
            size ++;
        }

    }
}
