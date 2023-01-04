package Exception;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Wel come to calculator...");
        System.out.println("---------------------");
        while(true){
        System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Exit");
        System.out.println("Enter choice");
        int choice = scan.nextInt();

        int a =0;
        int b =0;
        if(choice>=1 && choice<=4){
            System.out.println("Enter first number: ");
             a = scan.nextInt();
            System.out.println("Enter second number");
             b = scan.nextInt();
        }

        switch (choice) {
            case 1:
//                int sum = c.add(a,b);
                System.out.println("Sum is: " + c.add(a, b));break;

            case 2:
                System.out.println("Difference: " + c.sub(a, b));break;
            case 3:
                System.out.println("Product: " + c.mul(a, b));break;
            case 4:
                System.out.println("Quotient: " + c.div(a, b));break;
            case 5:
                System.out.println("Thank You!!");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
        }

    }
}
