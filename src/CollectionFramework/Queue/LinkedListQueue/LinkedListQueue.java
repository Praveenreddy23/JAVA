package CollectionFramework.Queue.LinkedListQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(2);
        q.add(30);
//        System.out.println(q.peek());
        System.out.println(q.remove());//removed 3
        System.out.println(q.remove());//removed 4
    }
//    Deque<Integer> deque = new ArrayDeque<>();

}
