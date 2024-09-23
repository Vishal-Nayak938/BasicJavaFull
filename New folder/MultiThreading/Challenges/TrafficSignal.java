package MultiThreading.Challenges;

public enum TrafficSignal {

    RED(9000),
    GREEN(6000),
    YELLOW(5000);

    public final int onTimeMilisecond;

    TrafficSignal(int onTimeMilisecond)
    {
        this.onTimeMilisecond=onTimeMilisecond;
    }

}
