package CollectionFramework.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();

        ls.add(10);
        ls.add(20);
        ls.add(10);
        ls.add(30);
        ls.add(20);
        ls.add("Ok");
//     It will follow order of insertion.
//        It will not allow duplicates.
        System.out.println(ls);//[10, 20, 30, Ok]

        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("Git");
        l.add("Git");
        l.add("Hub");
        l.add("Repository");
        l.add("Repository");

        for (String s :l){
            System.out.println(s);
            //Git
            //Hub
            //Repository
            
        }
    }
}
