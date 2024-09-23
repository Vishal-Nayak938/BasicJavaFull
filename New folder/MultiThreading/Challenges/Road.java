package MultiThreading.Challenges;

public class Road {
    public static void main(String[] args) throws InterruptedException {

        TrafficLightThread t1 = new TrafficLightThread(TrafficSignal.RED);
        TrafficLightThread t2 = new TrafficLightThread(TrafficSignal.GREEN);
        TrafficLightThread t3 = new TrafficLightThread(TrafficSignal.YELLOW);
     t1.start();
     t1.join();
     t2.start();
     t1.join();
     t3.start();

    }

}
