package ExceptionHandling;
//Try with Multiple catch blocks
public class ArrayIOOBoundExpExample {
    static  int divide(int a, int b){
        System.out.println("Dividing "+a+" by "+b);
        int res = 0;
        res = a/b;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
       divide(10,0);
        }
        catch (ArithmeticException exp){
            System.out.println("cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("Index out of boundary");
        }
    }
}
