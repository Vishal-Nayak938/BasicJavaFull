package FileHandling;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFirstTime {
    public static void main(String args[])
    {
        String fileName="javaFile.txt";
        FileWriter f1=null;
        try {
             f1 = new FileWriter(fileName);
            f1.write("this is the best course of java ever!\n" +
                    "this is my first file handling class\n"
                    + "hello to all this is " +"vishal nayak\n");

//            for(int i=0;i<1000;i++)
//            {
//                if(i==50 || i==100 || i==150 || i==200 || i==300)
//                {
//                   f1.write("\n");
//                }
//               f1.write("* ");
//            }


f1.flush();
            System.out.println("file is written successfully!");

        }catch (IOException e)
        {
            System.out.printf("Exception occured %s",e.getMessage());
        }
           finally {
            try {
                f1.close();
            }catch (Exception t)
            {
                System.out.println("happy");
            }
        }

    }
}
