package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderFirstTime {
    public static void main(String args[])
    {
        String fileName="javaFile.txt";
        try(FileReader f2=new FileReader(fileName))
        {
            int read=0;
            do{
                read=f2.read();
                System.out.print((char) read);
            }while(read != -1);


        }
        catch (IOException p)
        {
            System.out.println("happy");
        }




    }
}
