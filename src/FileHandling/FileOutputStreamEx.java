package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/GitHub.txt");//Representing the file
        if (!f.exists()){
            f.createNewFile();
            System.out.println("Created file");
        }
        //Writing the text to file using FileOutputStream
        FileOutputStream fos = new FileOutputStream(f);
        String textToBeWritten = "Hello";
        fos.write(textToBeWritten.getBytes());
        fos.flush();
        fos.close();

    }
}
