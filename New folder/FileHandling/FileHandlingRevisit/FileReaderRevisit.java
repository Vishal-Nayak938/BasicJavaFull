package FileHandling.FileHandlingRevisit;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRevisit {
    public static void main(String... args)
    {
        try(FileReader f1=new FileReader("VishalInfo.txt"))
        {
           int read=0;
           do{
               read=f1.read();
//               System.out.println(read);
               System.out.print((char) read);
           }while(read != -1);

        }catch (IOException e)
        {
            System.out.println("Exception");
        }

    }
}
