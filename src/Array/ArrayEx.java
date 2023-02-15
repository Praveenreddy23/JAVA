package Array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        /**
         * Array -> used to store multiple value in a single variable
         * */

        int[] a ;// Array Declaration

        a = new int[2];// Array Creation

        System.out.println(a[0]);//0
        System.out.println(a[1]);//0 bez not initialize

        //Array initialization
        a[0] = 10;
        a[1] = 20;

        System.out.println(a[0]);//10
        System.out.println(a[1]);//20

        //Array Declaration and Creation
        double[] doubles = new double[3];

        System.out.println(doubles[0]);//0.0
        System.out.println(doubles[1]);//0.0
        System.out.println(doubles[2]);//0.0

        System.out.println(Arrays.toString(doubles));//[0.0, 0.0, 0.0]

        doubles[0] = 10.22;
        doubles[1] = 20.10;
        doubles[2] = 40.3;

        System.out.println(doubles[1]);

        System.out.println(Arrays.toString(doubles));

        System.out.println("-----------------------");

        String[] cars = {"Audi", "Benz", "Tesla"};

        cars[0] = "BMW";

        System.out.println(cars[2]);

        System.out.println(Arrays.toString(cars));

        String[] car = new String[3];
        
        car[0] = "Audi" ;
        car[1] = "BMW";
        car[2] = "Tesla";

        for (String s : car) {
            System.out.println(s);

        }



    }
}
