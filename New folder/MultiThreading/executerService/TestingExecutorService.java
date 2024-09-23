package MultiThreading.executerService;

import MultiThreading.UsingRunnableThread.ImplementingRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingExecutorService {
    public static void main(String ...ag)
    {
//        ExecutorService service= Executors.newSingleThreadExecutor();
        ExecutorService service= Executors.newFixedThreadPool(3);


        ImplementingRunnable task1=new ImplementingRunnable('*');
        ImplementingRunnable task2=new ImplementingRunnable('$');
        ImplementingRunnable task3=new ImplementingRunnable('#');
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
