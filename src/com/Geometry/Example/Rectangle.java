package com.Geometry.Example;

public class Rectangle {
    private int length,width;
    int A,P;
    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    public int getArea()
    {
        A=length*width;
        return A;
    }
    public int getPerimeter()
    {
        P=2*(length*width);
        return P;
    }


}
