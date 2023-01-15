package CollectionFramework.Map.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String,Integer> t = new TreeMap();

        t.put("Mango",20);
        t.put("Apple",23);
        t.put("Banana",24);
        Set<String> s = t.keySet();

        for(String key:s){
            System.out.println("Cost of 1kg :"+key+" is "+t.get(key));
            //Cost of 1kg :Apple is 23
            //Cost of 1kg :Banana is 24
            //Cost of 1kg :Mango is 20
        }
    }
}
