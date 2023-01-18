package CollectionFramework.Set.TreeSet;

import java.util.TreeSet;

public class ComparatorExample {
    int age;
    String name;

    ComparatorExample(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return age+" "+name;
    }

    public static void main(String[] args) {
        ComparatorExample s = new ComparatorExample(22,"Reddy");
        ComparatorExample s2 = new ComparatorExample(24,"Salaar");
        ComparatorExample s1 = new ComparatorExample(23,"Prabhas");

        SortAge age = new SortAge();
//Pass the object of the class which has the sorting logic to the constructor of the TreeSet.
        TreeSet<ComparatorExample> t = new TreeSet(age);

        t.add(s);
        t.add(s1);
        t.add(s2);

        for (ComparatorExample c : t){
            System.out.println(c);
        }
    }
}
