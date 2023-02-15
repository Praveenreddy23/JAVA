package libraries;
/**
--@ StringBuffer:->
    ->StringBuffer is a pre-defined final class present in java.lang package.
    ->StringBuffer introduce from JDK1.0
    ->String-buffer object are mutable in nature.
    ->StringBuffer is final and cannot be inherited.
    ->StringBuffer is immediate subclass of Object class
    ->StringBuffer is a thread-safe class and safe for use by multiple threads

--@ StringBuilder:->
    ->StringBuffer is a pre-defined final class present in java.lang package.
    ->StringBuffer introduce from JDK1.5
    ->String-buffer object are mutable in nature.
    ->StringBuilder are not safe for use by multiple threads.

--@ Both StringBuffer and StringBuilder implements the following:->
    1.Serializable
    2.Comparable
    3.CharSequence
 */
public class StringBufferAndBuilder {
    public static void main(String[] args)
    {
        String sb = "Salar";

        System.out.println(sb);//Salar
        sb.concat("Prabhas");
        System.out.println(sb);//Salar

        System.out.println("----------");

        String sb1 = "Salar ";
        System.out.println(sb1);//Salar
        sb1 =sb1.concat("Prabhas");
        System.out.println(sb1);//Salar Prabhas

        System.out.println("----StringBuffer------");

        StringBuffer sb2 = new StringBuffer("Aadipurush ");
        System.out.println(sb2);//Aadipurush
        sb2.append("Release on june");
        System.out.println(sb2);//Aadipurush Release on june3

        System.out.println("----StringBuilder------");

        StringBuilder sb3 = new StringBuilder("Project k ");
        System.out.println(sb3);//Project k
        sb3.append("Prabhas");
        System.out.println(sb3);//Project k Prabhas

    }

}
