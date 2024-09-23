package MapInterface;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MapChallenge {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("India","Delhi");
        map.put("China","Bijing");
        map.put("Pakistan","Islamabad");
        map.put("Nepal","Kathmandu");
        map.put("Afganistan","Kabul");

        Scanner s1=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print("Enter Country Name: ");
            String name = s1.next();

            if(map.containsKey(name))
            {
                System.out.printf("The %s's Capital Is : %s\n", name,map.get(name));
            }else {
                System.out.println("sorry! we have not that country's capital.");
            }
        }

    }
}
