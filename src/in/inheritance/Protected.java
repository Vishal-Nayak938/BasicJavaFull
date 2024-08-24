package in.inheritance;

public class Protected {

    protected int Staring;
     protected int tier;
    protected int noOfSeats;
    protected void runFast()
    {
        String runFast="run very fast";
     System.out.printf("the car can be %s",runFast);

    }
public void getStaring()
{
    System.out.printf("Staring are : %d\n",Staring);
}
public void getTier()
{
    System.out.printf("Tier are : %d\n",tier);
}


    public Protected(int noOfSeats)
    {
        this.noOfSeats=noOfSeats;
        getStaring();
        getTier();
        System.out.println(noOfSeats);
    }

}
