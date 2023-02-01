package Logical.Program;

public class SwapString {
    public static void main(String[] args) {
        String a = "Drink";
        String b = "Cool Drink";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
}
