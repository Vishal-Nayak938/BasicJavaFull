package EnumsClasses;

public enum WeekDays {
    SUNDAY(false),MONDAY(true),TUESDAY(true),
    WEDNESDAY(true),FRIDAY(true),SATURDAY(false),THURSDAY(true);

    private final boolean isWeekday;

    WeekDays(boolean isWeekday)
    {
        this.isWeekday=isWeekday;
    }
String getType()
{
    return isWeekday ? "weekday" : "not week day";
}

}
