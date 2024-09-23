package Polymorphism;

public class MainPoly {
    public static void main(String args[])
    {
        car c=new car();
        Plane p=new Plane();
        vehicle v=new car();//upcasting of an object
        System.out.println(p.equals(p));
//        castTest(v);
//        castTest(c);
        castTest(p);

//        car c=(car)new vehicle();//down casting
//        vehicle v2=new Plane();
//        v2.goToPlace();
//        Object p=new vehicle();//object is parent of all the classes
//          c.noOfDoors();
    }

    private static void castTest(vehicle veh)//vehicle can take also car ref
    // because it is a class(datatype like: int ,String) so it can take a class type reference
    {
        veh.noOfDoors();
        Plane cveh =(Plane)veh;//down casting simply same as datatypes like: int ,char, double
    cveh.goToPlace();
    cveh.noOfDoors();

    }
}
