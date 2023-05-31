package PreJava;

public class Thhada {
    public static void main(String[] args) {
        Thhada a = new Thhada();
        String name = a.name(23, "Reddy");
        System.out.println(name);
    }
    String name(int age, String name){
        return "Age is "+age+"Name is "+name;
    }

}
