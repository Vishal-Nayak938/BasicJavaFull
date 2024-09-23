package WrapperClass;

public class TestingWrapper {

    public static void main(String ...args)
    {
//        Integer first=45;//nonPrimitive=primitive(AutoBoxing)
//        Integer second=56;
        Integer first=Integer.valueOf("56");
        Integer second=null;
        System.out.println(first.equals(9));
        System.out.println(first.doubleValue());
        second=67;
        System.out.println(second);
        int b=second;
        System.out.println(b);
    }
}
