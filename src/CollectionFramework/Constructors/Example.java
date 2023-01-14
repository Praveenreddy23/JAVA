package CollectionFramework.Constructors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {
//        Adding One collection to another collection
        ArrayList a = new ArrayList();
        a.add(10);
        System.out.println(a);//[10]

        LinkedList l = new LinkedList(a);
        l.add(20);
        System.out.println(l);//[10, 20]

        Vector v = new Vector(l);
        v.add(30);
        System.out.println(v);//[10, 20, 30]
        v.add(40);
        System.out.println(v);//[10, 20, 30, 40]

    }
}
