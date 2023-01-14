package CollectionFramework.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet T = new TreeSet<>();
//        It will not allow duplicates.
        T.add(10);
        T.add(30);
        T.add(30);
        T.add(20);

//        T.add(null);//NullPointerException
        T.add(2);

//        T.add('p');//ClassCastException
        System.out.println(T);//[2, 10, 20, 30]

        TreeSet t1 = new TreeSet();

        t1.add('p');
        t1.add('r');
        t1.add('e');
        t1.add('p');
//        t1.add("jaav");//ClassCastException
        System.out.println(t1);//[e, p, r]

        TreeSet<String> t = new TreeSet<String>();

        t.add("B");
        t.add("A");
        t.add("c");
        t.add("e");
        t.add("f");
        t.add("d");

        System.out.println(t);//[A, B, c, d, e, f]

        System.out.println("------------");

        for (String s :t){
            System.out.print(s+" ");//A B c d e f
        }





    }
}
