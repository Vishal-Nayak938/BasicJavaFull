package MultiThreading.ToCreateThread;

public class FirstTask extends  Thread {
    String sym;
    @Override
    public void run() {
        //First Task

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d %s ",i,sym);
        }
        System.out.printf("\n%s  Task Complete:",Thread.currentThread().getName());
    }

    FirstTask(String sym)
    {
        this.sym=sym;
    }

}
