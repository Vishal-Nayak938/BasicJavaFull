import java.util.Collection;

public class UtilityClass {

    public static <E>void print(Collection<E> collection)
    {
        System.out.printf("The List Is : ");
        for (E coll : collection) {
            System.out.print(coll+" ");
        }
        System.out.println();
    }

}
