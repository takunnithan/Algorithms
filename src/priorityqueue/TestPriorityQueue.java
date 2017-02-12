package priorityqueue;

/**
 * Created by takunnithan on 13-02-2017.
 */
public class TestPriorityQueue {

    public static void main(String[] args) {
        UnsortedPriorityQueue<Integer, String> priorityQueue = new UnsortedPriorityQueue<>();
        priorityQueue.insert(4,"Hola");
        priorityQueue.insert(2,"Blah");
        priorityQueue.insert(7,"Boo");
        priorityQueue.insert(5,"BoooHoo");
        priorityQueue.insert(3,"BlahBlah");


        System.out.println("------------------------------RESULT------------------------------------------");
        System.out.println("Size of the priority queue:" + priorityQueue.size());

        System.out.println("First item:" + priorityQueue.min().getValue());
        System.out.println("REMOVING FIRST ITEM..............");
        priorityQueue.removeMin();
        System.out.println("Next Item on the queue:" + priorityQueue.min().getValue());

    }
}
