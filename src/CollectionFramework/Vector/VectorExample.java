package CollectionFramework.Vector;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(10);
        v.add(20.4);
        v.add('p');
        v.add("Reddy");

        for (Object o :v){
            System.out.println(o);
        }
    }
}
