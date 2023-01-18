package CollectionFramework.Set.TreeSet;

import java.util.Comparator;

public class SortAge implements Comparator<ComparatorExample> {
//Design a new class in such a way which implements the comparator interface and specify the Generics type.
//    Override the compare() by specifying the business logic for comparing and sorting.
    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {

//        return o1.age - o2.age;
        return o1.name.compareTo(o2.name);
    }
}
