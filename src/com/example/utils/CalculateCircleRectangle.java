package com.example.utils;

import com.Geometry.Example.Circle;
import com.Geometry.Example.Rectangle;

public class CalculateCircleRectangle
{
    public static void main(String[] args)
    {
        Circle c1=new Circle(4);
        System.out.printf("the circle area is %f\n",c1.getArea());
        System.out.printf("the circumferrance is %f\n",c1.getCircumferrance());

        Rectangle r1=new Rectangle(3,5);
        System.out.printf("the rectangle Area is %d\n",r1.getArea());
        System.out.printf("the rectangle perimeter is %d",r1.getPerimeter());


    }
}
