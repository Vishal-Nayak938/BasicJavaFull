package MultiThreading.UsingRunnableThread;

public class ImplementingRunnable implements Runnable {
private final char sym;
    @Override
    public void run() {
//        Print Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d%c ",i,sym);
        }
        System.out.printf("\n%s  Task Complete:",Thread.currentThread().getName());
    }
   public ImplementingRunnable(char sym)
    {
        this.sym=sym;

    }

}
