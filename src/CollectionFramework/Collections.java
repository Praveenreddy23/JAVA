package CollectionFramework;

import java.util.ArrayList;

public class Collections {
    /*
    --@Collections :
      ->Collections is a pre-defined Class present in java.util package.
      ->it has inbuilt methods like sort , search.

         Collections (c)
        -> Sort ( )
        -> Binary search(
     */
//Collections is a pre-defined Class present in java.util package.
    public static void main(String[] args) {

        ArrayList A = new ArrayList();

        A.add(40);
        A.add(10);
        A.add(30);
        A.add(50);
        A.add(20);
        System.out.println("Before Sorting");
        System.out.println(A);//[40, 10, 30, 50, 20]

        java.util.Collections.sort(A);

        System.out.println("After Sorting");
        System.out.println(A);//[10, 20, 30, 40, 50]
    }
}