package MultiThreading.Challenges;

public class ThreadPrint extends Thread{
    private final  String signal;
    @Override
    public void run() {
//        System.out.printf("Thread start %d\n",signal);
        for (int i = 1; i <2 ; i++) {
            System.out.printf("Hello from thread %s\n",signal);
        }

        System.out.printf("Thread %s end\n",signal);

    }

    public ThreadPrint(String signal) {
        this.signal = signal;
    }
}
