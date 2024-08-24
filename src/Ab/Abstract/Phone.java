package Ab.Abstract;

//Phone is common property so we want that one cannot
// instantiate Phone class because Phone is not created which typeof phone is created that is important
//so the class will have to abstract :

abstract class Phone implements Transport{
        private int screenSize;
        protected int memory;
        int ram;
        String operatingSystem;

    public Phone(int memory,int ram,String operatingSystem)
    {
        this.memory=memory;
        this.ram=ram;
        this.operatingSystem=operatingSystem;
    }

    @Override
    public void setGetGo() {
        System.out.println("means is ready to go to place...");
    }

    abstract void startingSound();


    void setScreenSize(int screenSize)
    {
        this.screenSize=screenSize;
    }
    void getScreenSize()
    {
        System.out.println(screenSize);

    }

}