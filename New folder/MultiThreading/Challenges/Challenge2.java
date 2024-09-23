package MultiThreading.Challenges;

public class Challenge2 {

    public static void main(String[] args) throws InterruptedException{
        long startTime=System.currentTimeMillis();
        System.out.printf("starting at %d\n",startTime);
        ThreadPrint t1=new ThreadPrint("1");
        System.out.printf("the thread state is : %s\n",t1.getState());
        Thread.sleep(5000);
        System.out.printf("the thread state is : %s\n",t1.getState());
         t1.start();
        t1.join();
        long endTime=System.currentTimeMillis();
        System.out.printf("End time is %s\n",t1.getState());

        System.out.printf("Time Taken Is : %d",(endTime-startTime));
    }

}
