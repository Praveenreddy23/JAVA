package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet h = new HashSet<>();

        h.add(10);
        h.add(10);
        h.add(20.4);
        h.add('P');
        h.add('P');
        h.add("reddy");
        h.add(null);
        h.add(null);

//        It will not follow order of insertion.
//        It will not allow duplicates.
        System.out.println(h);//[P, null, 20.4, reddy, 10]
        System.out.println("-------------");

        System.out.println("Size: "+h.size());//Size: 5

        System.out.println("-------------");

        for (Object o : h){
            System.out.println(o);
            //P
            //null
            //20.4
            //reddy
            //10
        }
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            Object o = itr.next();
            System.out.println(o);
        }

    }
}
