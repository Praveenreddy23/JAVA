package ExceptionHandling.CustomException;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user id");
        String id = scan.next();
        System.out.println("Enter password");
        String password = scan.next();

        if (id.equals("Salaar")) {

            if (password.equals("Oct23") ) {
                System.out.println("Login Successful");
            }
            else
            {
                try{
//                throw new InvalidPasswordException();
                InvalidPasswordException obj = new InvalidPasswordException();
                throw obj;
                }
                catch(InvalidPasswordException e){
                    System.out.println("Invalid Password Entered");

            }
            }
        }
        scan.close();
    }

}
class InvalidPasswordException extends RuntimeException {

}

