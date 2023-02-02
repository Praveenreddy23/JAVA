package Banking;

import java.util.Scanner;

public interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    int checkBalance();

}
class BankImpl implements Bank{

    private int balance;
    BankImpl(int balance){
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Depositing Rs: "+amount);
        balance += amount;
        System.out.println("Amount Deposited successfully!!");

    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println("Withdrawing Rs: " + amount);
            balance -= amount;
            System.out.println("Amount Withdrawn successfully!!");
        }else {
            try {
                throw new InsufficientBalanceException("Insufficient Balance");
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    @Override
    public int checkBalance() {
        return balance;
    }
}
class MainSolution {
    public static void main(String[] args) {
        System.out.println("WelCome to Paytm Bank");
        System.out.println("----------------------------");

        Scanner scan = new Scanner(System.in);
        Bank b = new BankImpl(5000);
        while (true) {
            System.out.println("1)Deposit\n2)Withdraw\n3)CheckBalance\n4)Exit");
            System.out.println("Enter you are choice");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Amount to be Deposited");
                    b.deposit(scan.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter Amount to be Withdrawn");
                    b.withdraw(scan.nextInt());
                }
                case 3 -> System.out.println("Available Balance: " + b.checkBalance());
                case 4 -> {
                    System.out.println("Get lost dont come again");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice");
            }
        }

    }

}
class InsufficientBalanceException extends RuntimeException{
    private String message;

    public InsufficientBalanceException(String message) {

        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
/*
Rules for creating custom exception
->create a class with the w=exception name
->if class extends Exception ->checked Exception
->if class extends RuntimeException -> UncheckedException
->Override getMessage() -> variable,constructor and method
->invoke the exception using throw keyword and handle it using try and catch block
*/