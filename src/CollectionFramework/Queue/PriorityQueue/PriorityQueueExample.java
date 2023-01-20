package CollectionFramework.Queue.PriorityQueue;

import java.sql.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) throws InterruptedException {
    PriorityQueue<Integer> p = new PriorityQueue<>();

    p.add(10);
    p.add(20);
    p.add(30);
    p.add(40);
    p.add(50);

        System.out.println(p.peek());
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.peek());
        System.out.println(p.peek());
        System.out.println(p.element());
        System.out.println(p.element());
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.contains(1));
        System.out.println(p.iterator());
        System.out.println(p.toArray().length);

        System.out.println(p.stream().peek(System.out::println));



//    p.forEach(System.out::println);

    }
}
