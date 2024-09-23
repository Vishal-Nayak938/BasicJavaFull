package PassBy;

public class ToTestPassByValue {
    public  void testPassByValue()
        {
        int x=6;
        int y=9;
//            System.out.println(x+y);
        int sum=add(x,y);
        System.out.printf("the sum is %d",sum);
    }

     public  int add(int a,int b)
    {
               return a+b;
    }

}
