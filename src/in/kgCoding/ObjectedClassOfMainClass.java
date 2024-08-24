package in.kgCoding;

import java.util.Set;

public class ObjectedClassOfMainClass {

   public String color;
    String model;
    int number;
    int fuelLevel;
    long costOfPurchase;
    public ObjectedClassOfMainClass(String model,int number,int fuelLevel,int costOfPurchase)
    {
        //by the help of constructor we can access private and default field outside the package;
        this.model=model;
        this.number=number;
        this.fuelLevel=costOfPurchase;
        this.costOfPurchase=costOfPurchase;
    }
    public String toString()
    {
        StringBuilder sb=new StringBuilder("your car information is : ");
        sb.append("\nColor is: ").append(color);
        sb.append("\nmodel is: ").append(model);
        sb.append("\nyour number is: ").append(number);
        sb.append("\nyour fuelLevel is: ").append(fuelLevel);
        sb.append("\ncost of purchase is: ").append(costOfPurchase);
        return sb.toString();
    }

}
