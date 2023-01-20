package CollectionFramework.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        System.out.println("----------------------------");

        LinkedHashMap<Integer,String> l = new LinkedHashMap();

        l.put(23,"Reddy");
        l.put(21,"reddy");
        l.put(22,"Red");
       Set<Integer> s = l.keySet();

       for (int key :s){
           System.out.println(key+" "+l.get(key));
//                             key       Value
           //23 Reddy
           //21 reddy
           //22 Red
       }

        System.out.println(l);//{23=Reddy, 21=reddy, 22=Red}

        System.out.println("-----------------------");

        HashMap<String,Integer> h = new HashMap();
        h.put("Reddy",22);
        h.put("reddy",21);
        h.put("Red",23);

        Set<String> r = h.keySet();

        for (String key1 : r){
            System.out.println(key1+" "+h.get(key1));
             //Red 23
            //reddy 21
            //Reddy 22
        }
    }
}
