package Ab.Abstract;

public class Vivo  extends Phone{

    int selling;
    double ranking;

    public Vivo()
    {
        super(32,4,"Android");
    }

    void startingSound(){
        System.out.println(" tu..tu..tu ");
    }


    @Override
    public String toString() {
        return "Vivo{" +
                "memory=" + memory +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
