import java.util.ArrayList;
import  java.util.List;
public class ListRevisit {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Vishal");
        l.add("Anshul");
        System.out.println(l);
        System.out.println(l.contains("Vishal"));
        l.add(0,"Rajendra");
        System.out.println(l);
        l.set(1,"Nirmla");
        System.out.println(l);
        System.out.println(l.getLast());
        System.out.println( l.indexOf("Anshul"));
        l.clear();

//        System.out.println(l.getFirst());
    }
}
