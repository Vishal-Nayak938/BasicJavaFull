package MultiThreading.executerService;

public class ThreadPrint implements Runnable{
public final  int number;

@Override
    public void run() {
    for(int i=0;i<10;i++) {
        System.out.printf("number is : %d \n", i+1);
    }
    }
    ThreadPrint(int number)
    {
        this.number=number;
    }

}
