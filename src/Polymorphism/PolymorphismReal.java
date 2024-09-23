package Polymorphism;

public class PolymorphismReal {
public static void main(String args[])
{
car c1=new car();
Plane p1=new Plane();
    testPoly(c1);
    testPoly(p1);
}
private  static void testPoly(vehicle veh)
{
    veh.start();

}

}
