package Calculator.Welcome;

import java.util.Scanner;

public interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
    String invalid();

}
 class CalculatorIMPL implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        if (b!=0){
            return a/b;
        }
        return 0;
    }
    @Override
     public String invalid(){
        return "Enter valid input";
    }
}


 class MainCalculator  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        Upcasting
        Calculator c = new CalculatorIMPL();

        System.out.println("Wel come to calculator...");

        while(true){
            System.out.println("---------------------");
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
                case 1 ->
//                int sum = c.add(a,b);
                        System.out.println("Sum of : " + a + " &" + b + " is" + c.add(a, b));
                case 2 -> System.out.println("Difference of : " + a + " &" + b + " is" + c.sub(a, b));
                case 3 -> System.out.println("Product of : " + a + " &" + b + " is" + c.mul(a, b));
                case 4 -> {
                    int res = c.div(a,b);
                    if (res!=0){
                        System.out.println("Quotient of : " + a + " &" + b + " is" + res);
                    }
                    else {
                        System.out.println("Kindly do not divide by 0");
                    }
                }
                case 5 -> {
                    System.out.println("Thank You!!");
                    System.exit(0);
                }
                default -> System.out.println(c.invalid());
            }
        }

    }
}
/*
RULES FOR ABSTRACTION
->INTERFACE WITH ABSTRACT METHOD
->IS-A-RELATIONSHIP
->UPCASTING
->METHOD OVERRIDE

*/


