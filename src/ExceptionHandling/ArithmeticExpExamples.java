package ExceptionHandling;

public class ArithmeticExpExamples {
    public static void main(String[] args) {
        ArithmeticExpExamples.divide(10,0);//->try block is executed
       //If  Examples.divide(10,0);//->catch block is executed
    }
    static void divide(int n, int n1){
        System.out.println("Dividing "+n+" By "+n1);
        int res=0;
        try{
            System.out.println("try block started");
            res=n/n1;
            System.out.println("try block ended");
        }
        catch(ArithmeticException exp){
            System.out.println("Cannot divide n by n1 Hence dividing by 1");
           res=n/1;
            System.out.println(res);
        }
    }
}
