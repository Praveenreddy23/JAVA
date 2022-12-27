package libraries.reddy;

public class HashCodeExample {
    @Override
    public int hashCode() {
//        return super.hashCode();
        return 143;
    }

    public static void main(String[] args) {
        HashCodeExample  hash = new HashCodeExample();
        System.out.println(hash.hashCode());
    }
}
