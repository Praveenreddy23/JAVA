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

    }
}
