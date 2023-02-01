package Logical.Program;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        //2D ArrayList = is a dynamic list of lists.
        //you can change the size of these lists during runtime.

       ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String>  gameslist = new ArrayList<>();
        gameslist.add("Pub-G");
        gameslist.add("Ludo");
        gameslist.add("Snake");

        ArrayList<String>  productlist = new ArrayList<>();
        productlist.add("Tomatoes");
        productlist.add("peppers");
        productlist.add("lady finger");

        ArrayList<String> drinklist = new ArrayList<>();
        drinklist.add("Tea");
        drinklist.add("Coffee");
        drinklist.add("soda");

        groceryList.add(gameslist);
        groceryList.add(productlist);
        groceryList.add(drinklist);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));
    }
}
