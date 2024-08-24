package Challenge;

public class Abstract {

    public static void main(String[] args) {
        Circle s1 = new Circle();
        s1.caculateArea();
        s1.getArea();
        Square s2 = new Square();
        s2.caculateArea();
        s2.getSArea();

    }
}
 abstract class Shape {
    abstract void caculateArea();
}
class Circle extends Shape{
    int radius=4;
//    float Pi=3.14f;
    double Area;
    void caculateArea(){
        Area=Math.PI*Math.pow(radius,2);
    }
    void getArea()
    {
        System.out.println("Circle Area Is : "+Area);
    }
}
class Square extends Shape{
    int side=5;
    int SArea;
    void caculateArea()
    {
        SArea= (int) Math.pow(side,2);
    }
    void getSArea()
    {
        System.out.println("The Square Area Is : "+SArea);
    }
}