import java.util.ArrayList;
import java.util.List;

public class TestingListInCollection {
    public static void main(String[] args) {
        //<String> is called generics exist only for compile time not final(interpreter) time;
        List<String> strList= new ArrayList<>();
        strList.add("Vishal");
        strList.add(" Nayak");
//        strList.add(45);
        strList.add(1," Rajendra");
//        strList.remove(0);
        strList.set( 1," son of Rajendra");

        if(strList.contains(" son of Rajendra"))
        {
            System.out.println("son of Rajendra exist in list");
        }
        for (Object item : strList) {
            System.out.print(item);
        }

    }
}