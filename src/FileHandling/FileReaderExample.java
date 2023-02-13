package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args)  {
       try{
           File f = new File("D:/java.txt");
           System.out.println(f.getAbsolutePath() );
           FileReader fr = new FileReader(f);
        int ch = fr.read();
        while (ch != -1){
            System.out.print((char) ch);
            ch= fr.read();
        }
        fr.close();
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
