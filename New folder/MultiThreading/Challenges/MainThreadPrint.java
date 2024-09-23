package MultiThreading.Challenges;

public class MainThreadPrint {

    public static void main(String[] args) {
        ThreadPrint t1=new ThreadPrint("1");
        ThreadPrint t2=new ThreadPrint("2");
        ThreadPrint t3=new ThreadPrint("3");

        t1.start();
        t2.start();
        t3.start();

    }


}
