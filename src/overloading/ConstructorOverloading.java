package overloading;

public class ConstructorOverloading {

    ConstructorOverloading()
    {
        System.out.println("woof null constructor");
    }

    ConstructorOverloading(int n)
    {
        int i = 0;

        while (i < n) {
            System.out.printf("woof parametarized constructor %d\n",i);
            i++;
        }

    }
}
