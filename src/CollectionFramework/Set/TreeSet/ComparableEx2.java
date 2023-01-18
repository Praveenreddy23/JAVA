package CollectionFramework.Set.TreeSet;

import java.util.TreeSet;

public class ComparableEx2 implements Comparable<ComparableEx2> {
    int id;
    String name;
    double salary;

    ComparableEx2(int id , String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(ComparableEx2 o) {
//        return this.id - o.id;
//        //Employee{id=1, name='salaga', salary=44.6}
//        //Employee{id=2, name='saaga', salary=45.6}
//        //Employee{id=3, name='salg', salary=40.6}
//    }


//    @Override
//    public int compareTo(ComparableEx2 o) {
//        return this.name.compareTo(o.name);
//        //Employee{id=2, name='saaga', salary=45.6}
//        //Employee{id=1, name='salaga', salary=44.6}
//        //Employee{id=3, name='salg', salary=40.6}
//    }


//    @Override
//    public int compareTo(ComparableEx2 o) {
//        return (int) (this.salary - o.salary);
//        //Employee{id=3, name='salg', salary=40.6}
//        //Employee{id=1, name='salaga', salary=44.6}
//        //Employee{id=2, name='saaga', salary=45.6}
//    }


//    DESCENDING ORDER:
    @Override
    public int compareTo(ComparableEx2 o) {
        return o.id - this.id;
        //Employee{id=3, name='salg', salary=40.6}
        //Employee{id=2, name='saaga', salary=45.6}
        //Employee{id=1, name='salaga', salary=44.6}
    }

    public static void main(String[] args) {
        ComparableEx2 cm1 = new ComparableEx2(1,"salaga",44.6);
        ComparableEx2 cm2 = new ComparableEx2(3,"salg",40.6);
        ComparableEx2 cm = new ComparableEx2(2,"saaga",45.6);

        TreeSet<ComparableEx2> t = new TreeSet<>();

        t.add(cm);
        t.add(cm1);
        t.add(cm2);

        for (ComparableEx2 c : t){
            System.out.println(c);
        }
    }
}
