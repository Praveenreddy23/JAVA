package libraries;
/**
--@hashCode()
  ->hashCode() method return a unique id or no. for an object.
  ->hashCode() is used to identify an object uniquely.
  ->Syntax: public int hashCode()
 */
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
