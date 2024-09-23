import java.util.HashSet;
import  java.util.Set;

public class SetInterfaceOperation {
    public static void main(String ...args)
    {
        Set<Integer> set=new HashSet<>();
        set.add(12);
//        set.add("vishal");
//        set.add("anshul");
        set.add(45);
        set.add(34);
        set.add(12);
        set.add(12);
        set.add(99);
        set.add(67);

for(int i: set)
{
    System.out.println(i);
}
        System.out.println(  set.remove("12"));
        System.out.println(  set.contains(12));
        System.out.println(set.size());
        System.out.println(set);
    }
}
