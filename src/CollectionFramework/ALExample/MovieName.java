package CollectionFramework.ALExample;

import java.util.ArrayList;

public class MovieName {
     int date;
    String filmname;

    MovieName(int age, String name){
        this.date=age;
        this.filmname=name;
    }
    @Override
    public String toString(){
        return "Date :"+date+" FilmName: "+filmname;
    }

    public static void main(String[] args) {
        MovieName s = new MovieName(20,"Sallar");
        MovieName s1 = new MovieName(21,"Super Deluxe");
        MovieName s2 = new MovieName(22,"Project-k");

        ArrayList<MovieName> a = new ArrayList();

        a.add(s);
        a.add(s1);
        a.add(s2);

        for (MovieName m:a){
            System.out.println(m);//get FullyQualifiedClassName When u Donot use toSting();
            System.out.println("Date: "+m.date+" Filmname: "+ m.filmname);
            System.out.println("-----------");
//       Output:
//            CollectionFramework.ALExample.MovieName@58372a00
//            Date: 22 Filmname: Sallar
//                    -----------
//            CollectionFramework.ALExample.MovieName@10f87f48
//            Date: 22 Filmname: Super Deluxe
//                    -----------
//            CollectionFramework.ALExample.MovieName@b4c966a
//            Date: 22 Filmname: Project-k
//                    -----------

//       After Using toString():>
//            Date :20 FilmName: Sallar
//            Date: 20 Filmname: Sallar
//                    -----------
//            Date :21 FilmName: Super Deluxe
//            Date: 21 Filmname: Super Deluxe
//                    -----------
//            Date :22 FilmName: Project-k
//            Date: 22 Filmname: Project-k
//                    -----------


        }
    }
}
