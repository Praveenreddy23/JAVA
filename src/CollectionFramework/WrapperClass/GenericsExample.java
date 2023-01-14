package CollectionFramework.WrapperClass;

public class GenericsExample {

    public static void main(String[] Boxing) {
//       Primitive Datatype
        int a = 23;
        char c = 'P';
//       Non-Primitive Datatype
        Integer b = new Integer(3);
        Character ch = new Character('R');

        System.out.println(a+" "+b);
        System.out.println(c+" "+ch);

        System.out.println("----------------");

        //AutoBoxing Example :
        int i =10;
        Integer p = new Integer(i);
        System.out.println(i+" "+p);

        System.out.println("----------------");

        //AutoUnBoxing Example :
        Integer r = new Integer(23);
        int u =r;
        System.out.println(r+" "+u);

    }
}
