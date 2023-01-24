package ExceptionHandling.Exception.Throws;


import java.sql.SQLException;

public class ThrowsExample {
    static void divide(int a, int b) throws SQLException //For checked exception to look handler in caller Method
    {
        if (b == 0){
            throw new SQLException("Denominator cannot be 0");
        }
        else{
            System.out.println("Dividing "+a+" by "+b);
            int res = 0;
            res = a/b;
            System.out.println("Result is:"+res);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try {
            divide(10,0);
        } catch (SQLException e) {
            System.out.println("Printing exception details:");
            e.printStackTrace();
            //java.sql.SQLException: Denominator cannot be 0
            //	at ExceptionHandling.Exception.Throws.ThrowsExample.divide(ThrowsExample.java:10)
            //	at ExceptionHandling.Exception.Throws.ThrowsExample.main(ThrowsExample.java:23)
        }
        System.out.println("Main Method Ended");
    }
}
