package libraries;
/*1.toString() method:
        ->toString() will return String representation of an Object.
        Syntax:public String toString()
        ->When we print the reference variable or Object reference implicitly toString() gets called.
        ->toString() will returns the String representation of an Object in the below format:
        --> FullyQualifiedClass@HexaDecimalvalueOfHAshcode

 */

public class TostringExample {
    @Override
    public String toString(){
        return "toString";
    }

    public static void main(String[] args) {
        TostringExample to = new TostringExample();
        System.out.println(to);//implicitly calling tostring().
        System.out.println(to);//Explicitly calling tostring().
    }

}
