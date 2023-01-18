package CollectionFramework.List.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
 public class LinkedListExample {
        //LinkedList implements List<E>, Deque<E>, Cloneable, java.io.Serializable

        public static void main(String[] args) {

            LinkedList ll = new LinkedList();

            ll.add(10);
            ll.add(20);
            ll.add(30);
            System.out.println(ll);

            System.out.println("-----size() used For Collections------");
            for (int i = 0; i <ll.size() ; i++) {
                System.out.println(ll.get(i));}

            System.out.println("-----Reverse------");
            for (int i = ll.size()-1; i>=0 ; i--) {
                System.out.println(ll.get(i));}

            System.out.println("-----Length used For Array------");
            int [] x = {10,20,30};
            System.out.println(x.length);

            System.out.println("-----Length() used For String------");
            String s = "Java";
            System.out.println(s.length());

            System.out.println("===========addAll() removeAll() containAll()==========");

            ArrayList al = new ArrayList();

            al.add(10);
            al.add(20);
            System.out.println("Objects inside ArrayList: "+al+"Size: "+al.size());//Objects inside ArrayList: [10, 20]Size: 2
            System.out.println("_-----------------");

            LinkedList l = new LinkedList();
// addAll() - is used to add all the objects of one collection into another collection.
            l.addAll(al);
            l.add(30);
            System.out.println("Objects inside ArrayList: "+l+"Size: "+l.size());//Objects inside ArrayList: [10, 20, 30]Size: 3
// containAll() is used to check if all the objects of one collection is present inside another collection or not.
            System.out.println(l.containsAll(al));//true

            l.remove(1);
            System.out.println("Objects inside ArrayList: "+l+"Size: "+l.size());
            System.out.println(l.containsAll(al));//false

// removeAll() is used to remove all the objects of one collection from another collection.
            l.removeAll(al);
            System.out.println("Objects inside ArrayList: "+l+"Size: "+l.size());
             System.out.println(al.containsAll(l));//false

            System.out.println("============add() and set()==============");

            ArrayList a = new ArrayList();

            a.add(10);
            a.add(20);
            a.add(30);
            System.out.println(a);//[10, 20, 30]
//    add(index,value)- is used to add an object based on the index position already existing object gets shifted to the next position.
            a.add(1,40);
            System.out.println(a);//[10, 40, 20, 30]

//    set(index,value)- is used to set an object based on the index position already existing object gets overridden.
            a.set(2,50);
            System.out.println(a);//[10, 40, 50, 30]

            System.out.println("==============Collections===============");
//Collections is a pre-defined Class present in java.util package.
            ArrayList A = new ArrayList();

            A.add(40);
            A.add(10);
            A.add(30);
            A.add(50);
            A.add(20);
            System.out.println("Before Sorting");
            System.out.println(A);//[40, 10, 30, 50, 20]

            Collections.sort(A);

            System.out.println("After Sorting");
            System.out.println(A);//[10, 20, 30, 40, 50]


        }
    }


