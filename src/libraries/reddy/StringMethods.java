package libraries.reddy;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
//        String s = "Praveen Reddy";
        String str= new String("Praveen Reddy");
        System.out.println(str.length());//13
        System.out.println(str.startsWith("pra"));//false
        System.out.println(str.endsWith("dy"));//true
        System.out.println(str.toUpperCase());//PRAVEEN REDDY
        System.out.println(str.toLowerCase());//praveen reddy
        System.out.println(str.charAt(2));//a
        System.out.println(str.indexOf('a'));//2
        System.out.println(str.contains("een R"));//true
        String s = "reddy";
        String s1 = "REDDY";
        String s3 = "reddy";
        System.out.println(s.equals(s1));//false
        System.out.println(s.equals(s3));//true
        System.out.println(s.equalsIgnoreCase(s1));//true

    }
}
