package CollectionFramework.Generics;

import java.util.ArrayList;

public class MyGenericsClass <Thing,Things>{
    Thing a ;
    Things b;
    MyGenericsClass(Thing a,Things b){
        this.a= a;
        this.b = b;
    }
    public Things getValue(){
        return b;
    }
}
class Main{
    public static void main(String[] args) {

        MyGenericsClass<Integer,Integer> myInt = new MyGenericsClass<>(1,2);
        MyGenericsClass<Double,Double> myDouble = new MyGenericsClass<>(1.1,2.2);
        MyGenericsClass<Character,Character> myChar = new MyGenericsClass<>('A','B');
        MyGenericsClass<String,String> myString = new MyGenericsClass<>("Hello","Bye");


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }

}
