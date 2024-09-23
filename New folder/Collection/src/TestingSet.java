import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();

        System.out.println( names.add("Apple"));
        System.out.println( names.add("Mango"));
        System.out.println( names.add("Banana"));
        System.out.println( names.add("Cherry"));

UtilityClass.print(names);
        System.out.println(names.add("Apple"));
        UtilityClass.print(names);
        System.out.println(names.contains("Apple"));
        names.remove("Apple");
        UtilityClass.print(names);

    }
}
