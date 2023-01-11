package CollectionFramework;

public class For_Each_Loop {
/*
--@For-each Loop:
  ->From JDK 1.5 onwards new loop introduced known as for-each loop.
  ->This loop is used to go through each element of an array or any collection.
  ->If we want to traverse set which is not indexed , then we should go for " for each loop “ .
--@ Syntax:
    For ( array_ type  variable name : array name ( or ) collection reference _ variable )
    {
    // set of instruction...
    }
 */

    public static void main(String[] args) {
            System.out.println("-----for Loop-----");
            int[] a= {10,20,30,40};
            for (int i = 0; i <a.length ; i++) {
                System.out.println(a[i]);
            }
            System.out.println("-----For each Loop-----");
                for (int l : a) {
                    System.out.println(l);
                }
        System.out.println("----double------");
                double[] percent = {1.1,2.2,3.3,4.4,5.5};

        for (double d:percent) {
            System.out.println(d);
        }
        System.out.println("------String-------");
        String[] film = {"Salaar ", "Aadipurush", "Project-k"};

        for (String films:film) {
            System.out.println(films);
        }
    }
}
