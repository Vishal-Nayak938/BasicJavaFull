package MultiThreading.UsingRunnableThread;

public class MainThread {
    public static void main(String[] args) {
        ImplementingRunnable p1=new ImplementingRunnable('*');
        ImplementingRunnable p2=new ImplementingRunnable('$');
        ImplementingRunnable p3=new ImplementingRunnable('#');

        Thread  t1=new Thread(p1);
        t1.start();

        Thread  t2=new Thread(p2);
        t2.start();
        Thread  t3=new Thread(p3);
        t3.start();


    }


}
