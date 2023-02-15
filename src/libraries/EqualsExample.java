package libraries;
/**
 # equals():->
  ->equals method used for content comparison.
  Syntax:public boolean equals(Object obj)
  ->by default equals method will compare the address or reference of two object.
   therefore, in order to compare the content of two object we have to override equals method (equals()).
 */
// program without overriding equals method:
/*public class EqualsExample {
    int age;
    EqualsExample(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        EqualsExample e = new EqualsExample(25);
        EqualsExample e1 = new EqualsExample(25);
        System.out.println(e==e1);
        System.out.println(e.equals(20)); -->False
    }
}

 * Rules for overriding equals():
 1.UpCasting
 2.Down Casting
 3.Comparison logic
 */
public class EqualsExample {
    int age;
    EqualsExample(int age){
        this.age=age;
    }

    @Override
    public boolean equals(Object obj) { //<-- Upcasting
        EqualsExample e = (EqualsExample) obj;//<--Down casting
        return this.age == e.age;// <-- comparison
               //e.age == e1.age
               // 20   ==  20
        //--> e = this
        //--> e1 = obj(upcasted reference)
    }

    public static void main(String[] args) {
        EqualsExample e = new EqualsExample(25);
        EqualsExample e1 = new EqualsExample(25);
        System.out.println(e.equals(e1)); //->True
    }
}



