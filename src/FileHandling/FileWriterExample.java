package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args)  {
        File f = new File("D:/java.txt");
        try (FileWriter fw = new FileWriter(f,true)) {// To concat the Strings
            fw.write(" Darlings");
            fw.flush();
            System.out.println("Data stored");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
