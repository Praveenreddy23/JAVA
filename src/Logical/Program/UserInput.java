package Logical.Program;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scan.nextLine();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Your favorite Actor");
        String actor = scan.nextLine();

        System.out.println("Hello: "+name);
        System.out.println("Yor are "+age+" years old");
        System.out.println("Fan of "+actor);

    }
}
