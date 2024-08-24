package in.kgCoding;

import in.inheritance.Protected;

public class ProtectedSubClass extends Protected  {
public int a;
public ProtectedSubClass()
{
    super(8);
    tier=4;
    Staring=1;
    noOfSeats=5;
    runFast();
    System.out.println();
    getTier();
    getStaring();

}
}
