package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FIleHandlingEx {
    public static void main(String[] args) throws IOException {
//To create a new folder
        File f = new File("D:/Thar");
//mkdir() is used to create a new folder.
         boolean res = f.mkdir();
        System.out.println(res);

        System.out.println("---------------createNewFile()----------------");

// To create a file
    File f1 = new File("D:/Thar1.pdf");
//createNewFile() is used to create a new file based on the extensions.
//  Eg: (.txt, .doc, .pdf, .xlsx, etc...)
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------exits() and  delete()---------------");

    File f2 = new File("D:/Thar2.txt");
// exists() is used to check if the file/folder is present or not.
    if(f2.exists()){
// delete() is used to delete the file/folder.
        f2.delete();
        System.out.println("File deleted");
    }
    else {
        System.out.println("file not exist");
    }

        System.out.println("------------renameTo()--------------");
    File f3 = new File("D:/Thar1.doc");
    File f4 = new File("D:/BMW.doc");
//renameTo() is used to rename old file/folder to a new file/folder.
        System.out.println(f3.renameTo(f4));

        System.out.println("-------------lastModified()----------");
    File f5 = new File("D:/Thar4.xlsx");
//lastModified()is used to give the last modified date and time of the file/folder in milliseconds

    long milliseconds = f5.lastModified();
        System.out.println(milliseconds);

        System.out.println("----Date()-----");
//  Date() is used to convert milliseconds in to proper date and time format.
        Date  d = new Date(milliseconds);
        System.out.println(d);

        System.out.println("--------------Or-------------");

        System.out.println(new Date(milliseconds));

        System.out.println("----------File Information");

        File i = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Reddy.txt");
        System.out.println(i.createNewFile());
        if (i.exists()){
            System.out.println("File Name: "+i.getName());
            System.out.println("File Location: "+i.getAbsolutePath());
            System.out.println("File Size: "+i.length());
            System.out.println("File Readable: "+i.canRead());
            System.out.println("File Writable: "+i.canWrite());
            System.out.println("File Removed: "+i.delete());
            System.out.println(i.getAbsoluteFile());
        }
        else{
            System.out.println("File DoesNot Exits!!!!");
        }
    }
}
