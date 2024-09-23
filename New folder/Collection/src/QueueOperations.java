import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String args[])
    {
        Queue<String> q=new LinkedList<>();
        q.add("Vishal");
        q.add("Akshay");
        q.add("Anshul");
        q.add("Sachin");
        q.add("Aakash");
        q.add("Himanshu");
        q.add("Rohit");
        q.add("Amit");
        q.add("Vishal");
        System.out.println(q);
        System.out.println(q.offer("Any"));
        System.out.println(q);
        q.remove("Sachin");
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.element());
//        q.clear();
//        q.element();
//        q.iterator();

        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
