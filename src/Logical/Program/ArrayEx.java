package Logical.Program;

import java.util.Arrays;

public class ArrayEx {
    //Array -> is used to store multiple values in a single variable.
    public static void main(String[] args) {

        String[] names = {"a","b","c"};

        names[0] ="d";
        System.out.println(Arrays.toString(names));

        //2D array -> an array of arrays

       // String[][] name = new String[3][3];
           String[][] name = {
                                   {"Thar","Thar1","Thar2",},
                                   {"Thar3","Thar4","Thar5",},
                                   {"Thar6","Thar7","Thar8",}
                             };
       /* name[0][0]="Thar";
        name[0][1]="Thar1";
        name[0][2]="Thar2";
        name[1][0]="Thar3";
        name[1][1]="Thar4";
        name[1][2]="Thar5";
        name[2][0]="Thar6";
        name[2][1]="Thar7";
        name[2][2]="Thar8";

        */
        for (String[] s :name) {
            System.out.println(Arrays.toString(s));
        }

    }
}
