package Polymorphism;

public abstract class vehicle {//parent class
    void goToPlace()
    {
        System.out.println("A vehicle can go one place to another place!");
    }

   abstract void start();

    void noOfDoors()
    {
        System.out.println("the vehicle has doors!");
    }

}
