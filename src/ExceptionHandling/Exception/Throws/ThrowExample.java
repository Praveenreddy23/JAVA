package ExceptionHandling.Exception.Throws;
//Own Method to throw Exception
public class ThrowExample {
    static void divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Denominator cannot be 0");
                                          // Two types of arg
//                                            1)String arg type
//                                            2)No arg can
        }
        else {
            System.out.println("Dividing "+a+" by "+b);
            int res =0;
            res =a/b;
            System.out.println("Result is: "+res);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try{
            divide(10,0);
        }
        catch (ArithmeticException e){
            System.out.println("Printing exception details:");
            e.printStackTrace();
            //java.lang.ArithmeticException: Denominator cannot be 0
            //	at ExceptionHandling.Exception.Throws.ThrowExample.divide(ThrowExample.java:6)
            //	at ExceptionHandling.Exception.Throws.ThrowExample.main(ThrowExample.java:22)
        }
        System.out.println("Main Method ended");
    }
}

