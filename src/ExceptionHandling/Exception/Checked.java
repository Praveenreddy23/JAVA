package ExceptionHandling.Exception;
//Example for Checked exception :

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args)  {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
//        InterruptedException :
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        FileNotFoundException :
        try {
            FileReader f = new FileReader("Checked.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
