package CollectionFramework.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Library {
    String bname;
    String aName;
    int bId;
    String duration;

    public Library(String bname, String aName, int bId, String duration) {
        this.bname = bname;
        this.aName = aName;
        this.bId = bId;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "BookName: " + bname + " AuthorName: " + aName + " BookId: " + bId + " WDuration: " + duration;
    }

    public static void main(String[] args) {
        Library s1 = new Library("BTD", "Laxmikanth", 65647, "2-Months");
        Library s2 = new Library("ATD", "Amit", 45647, "1-Months");
        Library s3 = new Library("OR", "Shivanand", 75634, "3-Months");

        LibraryDetails d = new LibraryDetails();

        TreeSet<Library> t = new TreeSet<>(d);
        t.add(s1);
        t.add(s2);
        t.add(s3);

        Iterator i = t.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);

//        PriorityQueue<Library> pq = new PriorityQueue<>();

//        pq.add(s1);
//        pq.add(s2);
//        pq.add(s3);
//
//        System.out.println(pq.peek());
//        System.out.println(pq.element());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
//        System.out.println(pq.peek());


        }



    }
}
