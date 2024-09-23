package MultiThreading.executerService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(String... ag)
    {
//        ExecutorService service= Executors.newSingleThreadExecutor();
        ExecutorService service= Executors.newFixedThreadPool(3);

        ThreadPrint t1=new ThreadPrint(1);
//        ThreadPrint t2=new ThreadPrint(2);
        service.submit(t1);
//        service.submit(t2);

service.shutdown();
    }

}
