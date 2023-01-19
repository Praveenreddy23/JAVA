package CollectionFramework.Set.TreeSet;

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
        //It is complexity auto sorted.

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
        System.out.println("-------compareTo()--------");

        String a = "A";//ASCII Value : 65
        String b = "B";//ASCII Value : 66
        String c = "C";//ASCII value : 67

        System.out.println(a.compareTo(b));//-1
//                         65.compareTo(66))
//                          65 < 66 --> -1
//                          65 - 66 --> -1
        System.out.println(b.compareTo(a));//1
//                        66.compareTo(65))
//                         66 > 65 --> +1
//                         66 - 65 --> +1
        System.out.println(b.compareTo(b));//0


        System.out.println(c.compareTo(b));//1
//                        67.compareTo(66))
//                        67 > 66 --> +1
//                        67 - 66 --> +1



    }
}
