package libraries;
/*
--#Note,
   --@ String class implements the following interfaces:->
      1)Serializable
      2)Comparable
      3)char sequence
   --> String class also implicitly inherits the object class and has Overridden 3 methods:->
       1)toString()
       2)hashCode()
       3)equals()
   1)toString() method should have return the String  representation of an object
       but in String class toString() method is overridden  to return a set of character.
   2)hashCode() method should have return a unique random no. but in String class
       hashCode() method is overridden to return ASCII value.
   3)equals() method should have compare the address or reference of two object
       but in String class equals() method is overridden to compare the content of two String object.

   -->( = = ) will compare the address or reference.
   -->equals() will compare the content or date.
 */
//Example:
/*public class StringExample {
    public static void main(String[] args)
    {
        StringExample s= new StringExample();

        System.out.println(s);//libraries.reddy.StringExample@58372a00
        System.out.println(s.toString());//libraries.reddy.StringExample@58372a00
        System.out.println(s.hashCode());//1480010240

        StringExample s1= new StringExample();
        StringExample s2= new StringExample();

        System.out.println(s1.equals(s2));//false
        }
}
*/
public class StringExample {
    public static void main(String[] args)
    {
        String s= "";

        System.out.println(s);// null
        System.out.println(s);// null
        System.out.println(s.hashCode());//0

        String s1= "";
        String s2= "";
//        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//true

    }

}

