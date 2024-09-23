package EnumsClasses;

public class TestEnumsClasses {

    public static void main(String[] args) {
        TrafficLIght color=TrafficLIght.RED;
        color=TrafficLIght.GREEN;
        color=TrafficLIght.YELLO;
        System.out.println(color);
        Grade g=Grade.valueOf("A");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
//        g=Grade.D;
//        System.out.println(g);



    }
}
