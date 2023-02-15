package Array;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] name = {
                {"Thar","Thar1","Thar2",},
                {"Thar3","Thar4","Thar5",},
                {"Thar6","Thar7","Thar8",}
        };
       /** name[0][0]="Thar";
        name[0][1]="Thar1";
        name[0][2]="Thar2";
        name[1][0]="Thar3";
        name[1][1]="Thar4";
        name[1][2]="Thar5";
        name[2][0]="Thar6";
        name[2][1]="Thar7";
        name[2][2]="Thar8";

        for (int i = 0; i < name.length; i++) {
            System.out.println();
            for (int j = 0; j < name.length; j++) {
                System.out.print(name[i][j]);
            }
        }*/



        System.out.println(name[0][2]);

        for (String[] strings : name) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
