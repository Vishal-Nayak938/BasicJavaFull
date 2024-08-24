package Polymorphism;

public class MainPoly {
    public static void main(String args[])
    {
        car c=new car();
        Plane p=new Plane();
        vehicle v=new car();
//        castTest(v);
        castTest(c);
//        castTest(p);

//        car c=(car)new vehicle();
//        vehicle v2=new Plane();
//        v2.goToPlace();
//        Object p=new vehicle();
//          c.noOfDoors();
    }

    private static void castTest(vehicle veh)//vehicle can take also car ref
    // because it is a class(datatype like: int ,String) so it can take a class type reference
    {
       car cveh =(car)veh;//downcasting simply same as datatypes like: int ,char, double
        System.out.println(cveh.fuelLevel());
    }
}
