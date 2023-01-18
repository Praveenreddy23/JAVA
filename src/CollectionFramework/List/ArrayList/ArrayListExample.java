package CollectionFramework.List.ArrayList;

import java.util.ArrayList;

    public class ArrayListExample {
        // ArrayList implements List<E>, RandomAccess, Cloneable, java.io.Serializable

        public static void main(String[] args) {
            ArrayList alist = new ArrayList();
//add() will add an object into the collection
            alist.add(10);
            alist.add(60.3);
            alist.add(10);
            alist.add(null);
            alist.add("Reddy");
            alist.add('P');

            System.out.println(alist);

            System.out.println("-------------------");
//get() will return the object based on index position.
            System.out.println(alist.get(4));//Reddy
//    System.out.println(alist.get(200));//IndexOutOfBoundsException

            System.out.println("-------------------");
//size() is used to count the number of object present in the collection
            System.out.println(alist.size());

            System.out.println("-------------------");
//contains() checks if the object is present in the collection or not
            System.out.println(alist.contains("Reddy"));//true
            System.out.println(alist.contains("reddy"));//false

            System.out.println("-------------------");
//remove() will remove an object from the collection based on index
            System.out.println(alist);//[10, 60.3, 10, null, Reddy, P]
            alist.remove(2);
            System.out.println(alist);//[10, 60.3, null, Reddy, P]

            System.out.println("-------------------");
//isEmpty() will check if the collection is empty or not
            System.out.println(alist.isEmpty());//false

            System.out.println("-------------------");
//clear() will remove all the objects present in the collection
            System.out.println(alist);//[10, 60.3, null, Reddy, P]
            alist.clear();
            System.out.println(alist);//[]

            System.out.println("-------------------");

            System.out.println(alist.isEmpty());

            System.out.println("===========================");
// We can create any number of object
            ArrayList l = new ArrayList();

            l.add(10);
            l.add(30);
            l.add(40);
            l.add(60);
            l.add(10);
            l.add(80);
            l.add(10);
            l.add(90);

            System.out.println(l);

            System.out.println("-------------------");
//indexOf() will find the index position of an object and first occurrence in case of duplication.
            System.out.println(l.indexOf(90));//7
            System.out.println(l.indexOf(30));//1
            System.out.println(l.indexOf(300));//-1
            System.out.println(l.indexOf(10));//0

            System.out.println("-------------------");
// lastIndexOf() is used to find the last index position of an object.
            System.out.println(l.lastIndexOf(10));//6
        }
    }


