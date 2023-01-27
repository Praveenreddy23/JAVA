package GarbageCollection;

public class GarbageColEx {
    public GarbageColEx() {
        System.out.println("Object is created");
    }
    @Override
    protected  void finalize(){
        System.out.println("Object is Destroyed");
    }
}
class Collector{
    public static void main(String[] args) {
        GarbageColEx g = new GarbageColEx();
        g = null;//By Assigning a null

        GarbageColEx a = new GarbageColEx();
        GarbageColEx b = new GarbageColEx();
         a = b;//By Assigning  reference to another

        new GarbageColEx();//By anonymous Object

        System.gc();
    }
}
