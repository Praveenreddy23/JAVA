package CollectionFramework.Queue.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(304);
        s.push(24);
        s.push(203);
        s.push(202);
        s.push(120);


        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
