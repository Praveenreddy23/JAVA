package Logical.Program;

import java.util.Scanner;

public class SwitchEx {
    //switch ->statement that allows a variable to be tasted for equality against a list of values.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Month");
            String month = scan.next();
            switch (month) {
                case "January":
                    System.out.println("It is My Friend Month");
                    break;
                case "February":
                    System.out.println("It is february");
                    break;
                case "March":
                    System.out.println("It is march");
                    break;
                case "April":
                    System.out.println("It is april");
                    break;
                case "May":
                    System.out.println("It is may");
                    break;
                case "June":
                    System.out.println("It is My Month");
                    break;
                case "July":
                    System.out.println("It is july");
                    break;
                case "August":
                    System.out.println("It is august");
                    break;
                case "September":
                    System.out.println("It is september");
                    break;
                case "October":
                    System.out.println("It is october");
                    break;
                case "November":
                    System.out.println("It is My Ex Month");
                    break;
                case "December":
                    System.out.println("It is December");
                    break;
                default:
                    System.out.println("That is not a Month!!!");
            }
            String day = "Saturday";

//Enhance switch statement:-
            switch (day) {
                case "Sunday" -> System.out.println("It is sunday");
                case "Monday" -> System.out.println("It is monday");
                case "Tuesday" -> System.out.println("It is tuesday");
                case "Wednesday" -> System.out.println("It is wednesday");
                case "Thursday" -> System.out.println("It is thursday");
                case "Friday" -> System.out.println("It is friday");
                case "Saturday" -> System.out.println("It is saturday");
                default -> System.out.println("That is not a day!!!");
            }
        }
    }
}
