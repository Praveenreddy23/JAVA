package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Genericss {
    /*
 --@ Generic class:->
    ->To achieve generic class, we have to use angular braces < > , by using
      generics we can store homogenous objects of a specified class type.
       Map is of generic type by default.
Primitive Datatype:                  Wrapper Datatype:
    byte                                   Byte
    short                                  Short
    int                                    Integer
    long                                   Long
    float                                  Float
    double                                 Double
    char                                   Character
    boolean                                Boolean
     */
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("10");
        s.add("java");
        s.add("Reddy");

        for (String r :s) {
            System.out.println(r);
        }

        System.out.println("---------------------");

        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(10);
        i.add(20);
        i.add(30);


        for (Integer e :i) {
            System.out.println(e);
        }

        System.out.println("---------------------");

        LinkedList<Double> d = new LinkedList<Double>();
        d.add(8.5);
        d.add(6.77);
        d.add(98.9);

        for(double t:d){
            System.out.println(t);
        }

        System.out.println("-------AutoBoxing----------");

        int a = 23;
        char c = 'p';
        double d1 = 50.8;

        ArrayList l = new ArrayList();
        l.add(a);//l.add(new Integer(a));   ->l.add(new Integer(23));
        l.add(c);//l.add(new Character(c)); ->l.add(new Character('p'));
        l.add(d1);//l.add(new Double(d1));  ->l.add(new Double(50.8));

//       If there are Heterogeneous Objects we should use SuperClass called 'Object';
        for (Object o:l){
        System.out.println(o);}

        System.out.println("---------------------");

        LinkedList<Object> ll = new LinkedList();
        ll.add(23);
        ll.add("Reddy");

        for (Object e :ll) {
            System.out.println(e);
        }


    }

}
