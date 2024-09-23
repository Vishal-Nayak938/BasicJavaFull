package MultiThreading;

public class NeedOfMultithreading {
    public static void main(String ...args)
    {

        long startTime=System.currentTimeMillis();
        //First Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\nFirst Task Complete:");

//Second Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\nSecond Task Complete:");
//third Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\nThird Task Complete:");

        long endTime=System.currentTimeMillis();
        System.out.printf("time taken to complete task: %d ",(endTime-startTime));
    }
}
