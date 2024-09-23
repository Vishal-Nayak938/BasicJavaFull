import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String... args)
    {
        List<Integer>  numList=new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(4);
        numList.add(3);
        numList.add(0);
        UtilityClass.print(numList);

        Collections.sort(numList);
        UtilityClass.print(numList);

        Collections.reverse(numList);
        UtilityClass.print(numList);

        Collections.shuffle(numList);
        UtilityClass.print(numList);
try {
    List<Integer> unmodifiable = Collections.unmodifiableList(numList);
    unmodifiable.add(34);
}
catch (UnsupportedOperationException ex)
{
    System.out.println("Exception");
}

    }

}
