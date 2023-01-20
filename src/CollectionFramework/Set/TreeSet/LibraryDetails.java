package CollectionFramework.Set.TreeSet;

import java.util.Comparator;

public class LibraryDetails implements Comparator<Library> {
    @Override
    public int compare(Library o1, Library o2) {
        return o1.bId- o2.bId;
    }
}
