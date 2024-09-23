package MultiThreading.Challenges;

public class ChallengeNumber3 {

    public static void main(String... args) throws InterruptedException
    {
    ThreadPrint t1=new ThreadPrint("RED") ;
        ThreadPrint t2=new ThreadPrint("GREEN");
        ThreadPrint t3=new ThreadPrint("YELLOW");

        t1.start();
        Thread.sleep(5000);
//        t1.join();//join stops the main thread un-till t1 completed
        t2.start();//
        Thread.sleep(5000);
//        t2.join();
        t3.start();


    }

}
