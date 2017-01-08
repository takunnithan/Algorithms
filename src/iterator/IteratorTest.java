package iterator;

import java.util.Iterator;

/**
 * Created by takunnithan on 08-01-2017.
 */
public class IteratorTest {

    public static void main(String args[]){
        IteratorClass userList = new IteratorClass(10);
        userList.add(new User("John", 24));
        userList.add(new User("Mathew", 30));
        userList.add(new User("Terry", 28));
        Iterator<User> userIterator = userList.iterator();
        while(userIterator.hasNext()){
            System.out.println(userIterator.next());
        }

    }
}
