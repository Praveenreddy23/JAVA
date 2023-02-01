package Logical.Program;

import java.util.Scanner;

public class Logicaloperator {
    public static void main(String[] args) {
        /*
        Logical operator -> is used to connect two or more Expressions
                         --> && =(AND) both condition must be true.
                         --> || =(OR) either one condition true
                         --> !  =(NOT) reverses boolean value of condition
         */
        System.out.println("-------------&&(AND)----------------");
        int temp = 20;
        if(temp>39){
            System.out.println("It is Hot outside");
        }
        else if (temp>=15 && temp<+30){
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        System.out.println("--------------||(OR)------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Your playing a game! Press q or Q to quit");
        String responce = scan.next();

        if (responce.equals("q") || responce.equals("Q")){
            System.out.println("You quit the Game");
        }
        else {
            System.out.println("You are still playing the game *ludo*");
        }

        System.out.println("----------!(NOT)------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Your playing a game! Press s or S to Stop");
        String responce1 = sc.next();

        if (!responce1.equals("s") && !responce1.equals("S")) {
            System.out.println("You are still playing the game *ludo*");

        }
        else {
                System.out.println("You Stop the Game");
            }
        }

    }

