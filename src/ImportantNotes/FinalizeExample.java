package ImportantNotes;

public class FinalizeExample {
    public java.lang.System System;
    int a,b,c;

    public FinalizeExample(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        @Override
        protected  void finalize(){
       java.lang.System.out.println("Resources are free");
   }
}
class P{
    public static void main(String[] args) {
        FinalizeExample a = new FinalizeExample(10,20,30);
        a=null;
        System.gc();
        System.out.println("Removed");

    }
}
