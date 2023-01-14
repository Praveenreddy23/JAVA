package CollectionFramework.Examples;

import java.util.ArrayList;

public class Employee {
    int id;
    String name;

    Employee(int id , String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "ID: "+id+" Name: "+name;
    }

    public static void main(String[] args) {
        Employee e = new Employee(203,"Mani");
        Employee e1 = new Employee(204,"Akshay");
        Employee e2 = new Employee(205,"Reddy");
        Employee e3 = new Employee(206,"Joshi");

        ArrayList<Employee> a = new ArrayList<>();
        a.add(e);
        a.add(e1);
        a.add(e2);
        a.add(e3);

        for (Employee E:a){
            System.out.println(E);
//        Output:
//            ID: 203 Name: Mani
//            ID: 204 Name: Akshay
//            ID: 205 Name: Reddy
//            ID: 206 Name: Joshi

        }
    }
}
