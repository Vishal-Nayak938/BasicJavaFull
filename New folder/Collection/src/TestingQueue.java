import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String... args)
    {

        Queue<Integer> queueList=new LinkedList<>();
        queueList.add(1);
        queueList.offer(2);

        UtilityClass.print(queueList);

        System.out.println(queueList.peek());
        System.out.println(queueList.element());

        System.out.println(queueList.remove());
        UtilityClass.print(queueList);

        queueList.remove();
//        UtilityClass.print(queueList);
        System.out.println(queueList.poll());


    }
}
