import java.util.*;

public class CollectionsClass {
    public static void main(String... args)
    {
        List<Integer> s=new LinkedList<>();
        s.add(1);
        s.add(9);
        s.add(5);
        s.add(3);
        s.add(7);
        Collections.sort(s);
        System.out.println(s);

        Collections.shuffle(s);
        System.out.println(s);

        System.out.println(Collections.max(s));
        System.out.println(s);

      int index=Collections.binarySearch(s,9);
        System.out.println("At Index : "+index);

List<Integer> unmodifiable=Collections.unmodifiableList(s);
//        unmodifiable.add(90);
        System.out.println(unmodifiable);

    }

}
