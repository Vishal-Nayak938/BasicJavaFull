package MultiThreading.Challenges;

public class TrafficLightThread  extends Thread {
    private final TrafficSignal color;

    public TrafficLightThread(TrafficSignal color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s Active.\n", color);

        try {
            Thread.sleep(color.onTimeMilisecond);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.printf("%s Inactive\n", color);
    }
}
