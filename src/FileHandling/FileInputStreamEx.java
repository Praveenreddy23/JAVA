package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args)  {
        File f = new File("D:/GitHub.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //Reading the text from the file using FileInputStream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int i = 0;
        try {
            i = fis.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (i != -1){
            try {
                System.out.print((char) fis.read());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                i= fis.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
