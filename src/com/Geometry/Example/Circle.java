package com.Geometry.Example;

public class Circle {

    private double radius;
    double A,c;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        A=Math.PI*Math.pow(radius,2);
     return A;
    }
    public double getCircumferrance()
    {
        c=2*Math.PI*radius;
        return  c;
    }


}
