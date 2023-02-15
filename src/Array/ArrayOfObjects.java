package Array;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {

        //Store[] s = new Store[3];

        Store item1 = new Store("Pizza");
        Store item2 = new Store("Burger");
        Store item3 = new Store("BreadJam");

        Store[] s = {item1,item2,item3};

        /**s[0] = item1;
        s[1] = item2;
        s[2] = item3;*/

        System.out.println(s[0].name);
        System.out.println(s[1].name);
        System.out.println(s[2].name);








    }
}

// new class
 class Store {
    String name;
    Store(String name){
        this.name = name;
    }
}
