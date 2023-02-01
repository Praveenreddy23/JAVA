package Logical.Program;

import java.util.Scanner;

public class NestedLoop {
    //nested loops -> a loop inside another loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol ="";

        System.out.println("Enter no. of rows: ");
        rows= sc.nextInt();
        System.out.println("Enter no. of columns: ");
        columns= sc.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
