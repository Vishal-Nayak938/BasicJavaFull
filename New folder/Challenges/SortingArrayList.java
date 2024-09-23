package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vishal");
        list.add("anshul");
        list.add("akshay");
        list.add("rajendra");
        list.add("vishal");
        list.add("nirmla");
        list.add("akshay");
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Collections.frequency(list,"vishal"));
        System.out.println(list);
        swap(list,3,1);
    }

    public static void swap(List<String> l,int a,int b)
    {
        String f= l.get(b);
        String s=l.get(a);
        l.set(a,f);
        l.set(b,s);
        System.out.println(l);
    }

}
