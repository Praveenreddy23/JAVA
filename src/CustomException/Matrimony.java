package CustomException;

import java.util.Scanner;

public class Matrimony {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scan.nextInt();

        if(age>=21){
            System.out.println("Get Married Soon!!!");

        }else{
            try {
                throw new AgeInvalidException("Have patience!!! ");
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
//            AgeInvalidException age = new AgeInvalidException("Have patience!!! ");
//            throw age;
        }
    }
}
