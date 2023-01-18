package CollectionFramework.Set.TreeSet;

import java.util.TreeSet;

public class ComparableExample implements Comparable<ComparableExample> {
    int id;
    String name;

    public ComparableExample(int id , String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "ID: "+ id+ " "+"Name: "+name;
    }

//    @Override
//    public int compareTo(ComparableExample o) {
//        return this.id - o.id;
////        Optput
//        //ID: 1 Name: A
//        //ID: 2 Name: C
//        //ID: 3 Name: B
//    }


    @Override
    public int compareTo(ComparableExample o) {
        return this.name.compareTo(o.name);
//        output
        //ID: 1 Name: A
        //ID: 3 Name: B
        //ID: 2 Name: C
    }

    public static void main(String[] args) {
        ComparableExample c = new ComparableExample(3,"B");
        ComparableExample c1 = new ComparableExample(2,"C");
        ComparableExample c2 = new ComparableExample(1,"A");

        TreeSet<ComparableExample> t = new TreeSet();

        t.add(c);
        t.add(c1);
        t.add(c2);

        for (ComparableExample ce : t){
            System.out.println(ce);

        }

    }
}
