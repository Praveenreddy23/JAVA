package Logical.Program;

public class IfStatement {
    //if statement -> perform a block of code if its condition evaluates to be true

    public static void main(String[] args) {
        int age = 8;

        if (age>=70){
            System.out.println("Your boom!!!");
        } else if (age>=18) {
            System.out.println("Your an adult!!");
        } else if (age>=12) {
            System.out.println("Your a teenager");
        } else
        System.out.println("your not an adult!");
    }
}
