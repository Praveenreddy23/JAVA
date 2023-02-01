package Logical.Program;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 20;
        double z;
        z = Math.max(x,y);//for maximum value
        z = Math.min(x,y);//for minimum value
        z = Math.abs(y);//for absolute value
        z = Math.absExact(21);
        z = Math.round(x);//for roundUp
        z = Math.sqrt(y);
        System.out.println(z);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side no:");
        double a = scan.nextDouble();
        System.out.println("Enter side no:");
        double b = scan.nextDouble();

        double c =Math.sqrt((a*a+b*b));

        System.out.println("The Hypotenuse is:"+c);
        scan.close();

    }
}
