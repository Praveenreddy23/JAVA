package CollectionFramework.Map.HashMap;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap h = new HashMap();
// put()-> is used to add Key and Value inside Map.
        h.put(83,"Reddy");
        h.put("Prabhas",45);
        h.put(25,40);
//It will not follow order of insertion.
        System.out.println(h);//{83=Reddy, Prabhas=45, 25=40}

        System.out.println("_--------------------");

//   get()-> is used to get an Value based on the Key Specified.
        System.out.println(h.get(25));//40

        System.out.println("_--------------------");

//  containsKey()->is used to check if the Key is Present or not.
        System.out.println(h.containsKey(83));//true
        System.out.println(h.containsKey("Reddy"));//false
//   containsValue()->is used to check if the value is present or not.
        System.out.println(h.containsValue("Reddy"));//true

        System.out.println("_--------------------");

        System.out.println(h);//{83=Reddy, Prabhas=45, 25=40}

//      remove()->is used to remove an value based on the Key specified
        h.remove(83);

        System.out.println(h);//{Prabhas=45, 25=40}

        System.out.println("_--------------------");

//      isEmpty()->is used to check if the collection is empty or not
        System.out.println(h.isEmpty());//false

        System.out.println("_--------------------");
//      clear()->is used to remove all the objects from the collection.
        h.clear();
        System.out.println(h);//{}

    }
}
