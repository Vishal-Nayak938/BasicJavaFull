package FileHandling.FileHandlingRevisit;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRevisit {
    public static void main(String[] args)  {
//        FileWriter w=null;
        try ( FileWriter w= new FileWriter("VishalInfo.txt")){
//           w = new FileWriter("VishalInfo.txt");
            w.write("I am Batchlor");
            w.write('c');
            w.flush();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
