package ExceptionHandling;

public class TryAndCatch {
    public static void main(String[] args) {
        try
        {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid Denominator");
        }
        catch(NullPointerException e)
        {
            System.out.println("Invalid");
        }
        catch(Exception e)
        {
            System.out.println("Super Class Exception Handler");
        }
        System.out.println("-----------------------------------------------");
        //printStackTrace() : This method is used to get the complete info about the Exception.
        System.out.println("Hello");
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e){
            e.printStackTrace();
//            java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.TryAndCatch.main(TryAndCatch.java:26)
        }
        System.out.println("Bye");
        System.out.println("----------------------------------------------------");
       //getMessage() :  This method is used to return a small message about the exception occurred.
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e.getMessage());// by zero
            String message = e.getMessage();
            System.out.println(message);// by zero
        }
        System.out.println("-------------------------------------");
//       Finally-block : Is a block of code which gets executed all the time.
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid denominator");
        }
        finally
        {
            System.out.println("inside finally block");
        }
    }
}
