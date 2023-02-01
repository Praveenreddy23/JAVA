package Logical.Program;

import java.util.Scanner;

public class Whileloop {
    //while loop -> Executes a block of code as long as a its condition remains true.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = " ";
        while (name.isBlank()) {
            System.out.println("Enter your name");
            name = scan.nextLine();
        }
        System.out.println("Hello: " + name);

    }
}


