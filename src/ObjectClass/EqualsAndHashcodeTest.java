package ObjectClass;

public class EqualsAndHashcodeTest {
    public static void main(String arg[])
    {
      Person p1=new Person("Vishal",23,"002");
      Person p2=new Person("Vishal",23,"002");
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        String name="vishal kumar";
//        String name1="vishal kumar";
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
      if(p1.equals(p2))
      {
          System.out.println("equal");
      }else{
          System.out.println("not equal");
      }


    }

}
