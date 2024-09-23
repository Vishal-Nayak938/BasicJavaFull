package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String... args)
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",10);
        map.put("Mango",16);
        map.put("Banana",39);
        map.put("Cherry",45);

        System.out.println(map.size());
        System.out.println(map.get("Cherry"));
        System.out.println(map.containsKey("Papaya"));
        System.out.println(map.containsValue(10));
        System.out.println(map.remove("Mango"));
        System.out.println(map);
        System.out.println(map.keySet());
        for(String s: map.keySet())
        {
            System.out.printf("%s : %s\n",s,map.get(s));
        }

    }
}
