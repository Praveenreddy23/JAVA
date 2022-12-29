package Singleton;

public class Name {
    static String name = "Venkata Satyanarayana Prabhas Raju Uppalapati";
   private static Name n;
    private Name(){
        System.out.print("Full name: ");
    }
    public static Name Createobj(){
        if(n == null){
            n = new Name();
        }

        return n;

    }
}
