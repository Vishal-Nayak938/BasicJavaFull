import java.util.HashMap;
import java.util.Map;

public class MapInterfaceOprations {
    public static void main(String ...args)
    {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"vishal");
        map.put(2,"sachin");
        map.put(3,"anshul");
        map.put(4,"akshay");
        map.put(5,"aakash");
        map.put(6,"golu");
        map.put(7,"vishal");
        map.put(4,"vishal");
        System.out.println(map.keySet());
//        for (Integer i : map.keySet()) {
//            System.out.println(i);
//        }
        System.out.println(map);

    }
}
