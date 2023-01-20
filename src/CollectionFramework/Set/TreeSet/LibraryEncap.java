package CollectionFramework.Set.TreeSet;

import java.util.TreeSet;

public class LibraryEncap implements Comparable<LibraryEncap>  {
    private String bName;
    private  String aName;
    private int bId;
    private String bWduration;

    public LibraryEncap(String bName, String aName, int bId, String bWduration) {
        this.bName = bName;
        this.aName = aName;
        this.bId = bId;
        this.bWduration = bWduration;
    }
    @Override
    public String toString() {
        return "BookName: "+bName+" AuthorName: "+aName+" BookId: "+bId+" WDuration: "+bWduration;
    }
    @Override
    public int compareTo(LibraryEncap o) {
        return this.getbId()-o.getbId();
    }
    public String getbName() {
        return bName;
    }
    public String getaName() {
        return aName;
    }
    public int getbId() {
        return bId;
    }
    public String getbWduration() {
        return bWduration;
    }
    public static void main(String[] args) {
        LibraryEncap le = new LibraryEncap("BTD","Laxmikanth",65647,"2-Months");
        LibraryEncap le1 = new LibraryEncap("ATD","Amit",45647,"1-Months");
        LibraryEncap le2 = new LibraryEncap("OR","Shivanand",75634,"3-Months");

        TreeSet<LibraryEncap> t = new TreeSet<>();
        t.add(le);
        t.add(le1);
        t.add(le2);

//        t.forEach(details-> System.out.println(details));
        t.forEach(System.out::println);

    }


}
