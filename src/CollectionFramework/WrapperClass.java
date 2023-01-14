package CollectionFramework;

public class WrapperClass {
   /*
 --@Wrapper Class :
   -> All Wrapper Class are Pre-defined classes which belongs to java.lang package.
   --> The non-primitive version of a primitive datatype.
   -> All Wrapper class have overridden toString().
   ->For each and every primitive data type we have the corresponding class and
      those classes are called as wrapper class.
   ->We can perform an operation called AutoBoxing and AutoUnBoxing.

                                -:DataTypes:-
                 Primitive:                    Non-Primitive:(Default value:Null)
                 ->Keywords                      ->class
                 ->FixedSize                     ->No-FixedSize
                 ->Eg:8 Datatypes                ->Eg:String Etc...


              Primitive datatype                    Wrapper class
                  byte                                  Byte
                  short                                 Short
                  int                                   Integer
                  long                                  Long
                  float                                 Float
                  double                                Double
                  char                                  Character
                  boolean                               Boolean

1)AutoBoxing:
  -> Converting from primitive date type to Wrapper class object is called as AutoBoxing.

2)AutoUnBoxing:
  -> Converting from Wrapper class object back to its primitive datatype is called as AutoUnBoxing.

 */

   public static void main(String[] Boxing) {
//       Primitive Datatype
       int a = 23;
       char c = 'P';
//       Non-Primitive Datatype
       Integer b = new Integer(3);
       Character ch = new Character('R');

       System.out.println(a+" "+b);
       System.out.println(c+" "+ch);

       //AutoBoxing Example :
       int i =10;
       Integer p = new Integer(i);
       System.out.println(i+" "+p);

       //AutoUnBoxing Example :
       Integer r = new Integer(23);
       int u =r;
       System.out.println(r+" "+u);

   }

}



