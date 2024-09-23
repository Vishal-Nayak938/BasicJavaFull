package overloading;

public class MethodOverloading {
      void Mypen(int n)
    {
        System.out.printf("hello, i have red pen. and i have %d pens.\n",n);
    }

      void Mypen(int p,String name)
    {
        System.out.printf("hello, my name is %s and i have %d pens.",name,p);
    }
//overloading: Same class have same name functions with different parameter;

}
