package CollectionFramework.Map.HashMap;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap h = new HashMap();
// put()-> is used to add Key and Value inside Map.
        h.put(23,"Reddy");
        h.put(24,"Prabhas");
//It will not follow order of insertion.
        System.out.println(h);//{23=Reddy, 24=Prabhas}

        System.out.println("_--------------------");

//   get()-> is used to get an Value based on the Key Specified.
        System.out.println(h.get(23));

        System.out.println("_--------------------");

//  containsKey()->is used to check if the Key is Present or not.
        System.out.println(h.containsKey(23));//true
        System.out.println(h.containsKey("reddy"));//false
//   containsValue()->is used to check if the value is present or not.
        System.out.println(h.containsValue("Reddy"));//true

        System.out.println("_--------------------");

        System.out.println(h);//{23=Reddy, 24=Prabhas}

//      remove()->is used to remove an value based on the Key specified
        h.remove(23);

        System.out.println(h);//{24=Prabhas}

        System.out.println("_--------------------");

//      isEmpty()->is used to check if the collection is empty or not
        System.out.println(h.isEmpty());//false

        System.out.println("_--------------------");
//      clear()->is used to remove all the objects from the collection.
        h.clear();
        System.out.println(h);//{}

    }
}
