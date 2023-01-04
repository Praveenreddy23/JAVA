package CustomException;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int balance = 100000;
        System.out.println("Enter amount to be Withdrawn");
        int amount = scan.nextInt();

        if (amount<=balance){
            System.out.println("Withdrawal successful");
        }
        else{
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                System.out.println("Not Enough Balance to Withdraw");
            }
        }
        scan.close();

    }
}
