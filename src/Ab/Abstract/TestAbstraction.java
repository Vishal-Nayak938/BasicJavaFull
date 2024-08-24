package Ab.Abstract;

public class TestAbstraction {
    public static void main(String args[])
    {
//Phone p1=new Phone(4,5,"Android");//it is abstract class it cannot instantiate.
        Vivo v1=new Vivo();
        v1.startingSound();
        v1.setGetGo();
        Transport.charge();
    }

}









//Phone p1=new Phone(56,78,"Window10");
//        Vivo v1=new Vivo();
//        System.out.println(v1);
//        v1.setScreenSize(11);
//v1.getScreenSize();
//
//        System.out.println(v1.selling=40);
//        System.out.println(v1.ranking=4.5);