package Challenge;

public class Calculator {

  static   void add(int a,int b)
    {
        System.out.println(a+b);
    }
   static void add(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }
   static double add(double a,double b)
    {
        return Math.ceil(a+b);
    }

    public static void main(String[] args) {
        add(4,6);
        add(4,9,7);
        System.out.println(add(3.5,2.4));
    }

}
