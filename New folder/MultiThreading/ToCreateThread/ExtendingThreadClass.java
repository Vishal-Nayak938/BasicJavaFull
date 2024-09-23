package MultiThreading.ToCreateThread;

public class ExtendingThreadClass {
    public static void main(String ...args)
    {
        long startingTime=System.currentTimeMillis();
         FirstTask t1=new FirstTask("*");
        FirstTask t4=new FirstTask("&");
         SecondTask t2=new SecondTask();
         ThirdTask t3=new ThirdTask();

         t1.start();
         t2.start();
         t3.start();
         t4.start();
        long endingTime=System.currentTimeMillis();
        System.out.printf("%s Time Taken Is : %d",Thread.currentThread().getName(),(endingTime-startingTime));
    }
}
