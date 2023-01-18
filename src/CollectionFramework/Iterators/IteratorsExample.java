package CollectionFramework.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorsExample {

    public static void main(String[] args) {
        // Creating an ArrayList class object
        // Declaring object of integer type
        ArrayList<Integer> al = new ArrayList<>();

        // Iterating over the List
        for (int i = 0; i <10; i++) {
            al.add(i);
        }
        // Printing the elements in the List
        System.out.println(al);

        // At the beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator itr = al.iterator();

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        while(itr.hasNext()) {
            //  Moving cursor to next element
            int i = (int) itr.next();
            // Getting elements one by one
            System.out.print(i + " ");

            if (i % 2 != 0) {
                // Removing odd elements
                itr.remove();
            }
        }
        // Command for next line
            System.out.println();
        // Printing the elements inside the object
            System.out.println(al);
            //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            //0 1 2 3 4 5 6 7 8 9
            //[0, 2, 4, 6, 8]


        System.out.println("---Example of ListIterator---");

        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");

        ListIterator itrator = l.listIterator();
        System.out.println(l);// //[A, B, C, D, E]

        System.out.println("Elements in forward: ");
        while(itrator.hasNext())
            System.out.print(itrator.next()+" ");
                                //Elements in forward:
                                     //A B C D E
             System.out.println();

            System.out.println("Elements in backward: ");
            while (itrator.hasPrevious())
            System.out.print(itrator.previous()+" ");
                              //Elements in backward:
                                   //E D C B A




        }

        }


