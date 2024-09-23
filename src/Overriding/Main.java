package Overriding;

public class Main {
    public static void main(String args[])
    {
        Dog d1=new Dog();
        Cat c1=new Cat();
        Lion l1=new Lion();
        full(d1);
        full(c1);
        full(l1);

    }

    static  void full(Animal a)
    {
        a.sound();
    }

}
