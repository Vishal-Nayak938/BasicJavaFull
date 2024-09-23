package EnumsClasses;
//enum classes restrict us to insert multiple values it makes us limited ;
public enum TrafficLIght {
    RED("stop"),GREEN("go"),YELLO("Caution");

    private final String  action;

    TrafficLIght(String action)
    {
        this.action=action;
    }

}
