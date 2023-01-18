package ExceptionHandling.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked1 {
    static void minute() throws InterruptedException {
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
            Thread.sleep(3000);
        }
    }
     void file() throws FileNotFoundException {
        FileReader f= new FileReader("reddy.txt");
    }

    public static void main(String[] args) {
        try {
            minute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Checked1 c= new Checked1();
        try {
            c.file();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }


    }
}
