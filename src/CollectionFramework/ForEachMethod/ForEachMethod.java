package CollectionFramework.ForEachMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("Biriyani");
        foodList.add("Pizza");
        foodList.add("iceCream");
        System.out.println("----iterating by passing lambda expression----");

        foodList.forEach(food -> System.out.println(food));

        System.out.println("----ForEach loop");

        for (String a :foodList) {
            System.out.println(a);
        }

        System.out.println("----iterating by passing method reference----");

        foodList.forEach((System.out::println));

//        Stream forEachOrdered() Method example:
        System.out.println("----iterating by passing lambda expression----");
        foodList.add("mutton");
        foodList.stream().forEachOrdered(a -> System.out.println(a));

        System.out.println("----iterating by passing method reference----");
        foodList.add("Chicken");
        foodList.stream().forEachOrdered(System.out::println);

        System.out.println("-------------------forEach() in Map------------------------");

        Map<String,Integer> map = new HashMap<>();
        map.put("reddy",1);
        map.put("Praveen",2);
        map.put("Prabhas",3);
        map.put("Rebel",4);

        map.forEach((name,value) -> System.out.println("Name: "+name+" "+"Value: "+value));
        System.out.println("--------------------------------");
        Map<Integer,Double> map1 = new HashMap<>();
        map1.put(1, 1.1);
        map1.put(2, 2.2);
        map1.put(3, 3.3);
        map1.put(4, 4.4);

        map1.forEach((d,a)-> System.out.println(d+" "+a));


    }
}
