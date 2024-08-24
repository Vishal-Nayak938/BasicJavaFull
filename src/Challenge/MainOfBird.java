package Challenge;

public class MainOfBird {
    public static void main(String args[])
    {

//        Flyable f1=new Flyable() ;//interface is not instantiable
//        Bird b=new Bird();//abstract method cannot be instantiable
        Eagle e=new Eagle();
        System.out.printf("The bird has %s breed\n",e.getBreed());
        e.fly();

    }
}
