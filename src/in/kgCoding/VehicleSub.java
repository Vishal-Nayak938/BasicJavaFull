package in.kgCoding;

public class VehicleSub {
     int Staring;
    private int tier;
    int engine;

    public void setTier(int tier)
    {
        this.tier=tier;
    }
    protected void getTier()
    {
        System.out.printf("\nthe bike tiers are: %d\n",tier);
    }

    public void goFar()
    {
        System.out.printf("i am going place A to place B using %d tier",tier);

    }


}
