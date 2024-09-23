package EnumsClasses;

import java.util.Collections;

public class WeekDayTesting {

    public static void main(String[] args) {
        for (WeekDays value : WeekDays.values()) {
            System.out.printf("%s : %s\n",value,value.getType());
        }

//    WeekDays w=WeekDays.SUNDAY;

    }

}
