package Logical.Program;

import java.util.Scanner;

public class PalindromeNumber {

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = scr.nextInt();
            int temp = num;
            int rev = 0,rem;
            while(temp != 0){
                rem = temp%10;
                rev = rev*10+rem;
                temp =temp/10;
            }
            if(num == rev){
                System.out.println(num+ " Is a Palindrome Number");
            }
            else{
                System.out.println(num+ " Is  Not a Palindrome Number");
            }
        }
    }

