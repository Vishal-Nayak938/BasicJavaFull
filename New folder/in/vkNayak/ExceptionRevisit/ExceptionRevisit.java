package in.vkNayak.ExceptionRevisit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRevisit {


    public static void main(String ...args)
    {

        System.out.println("Enter two numbers: ");
        Scanner s1=new Scanner(System.in);
        int[] arr;
        try {
            int x = s1.nextInt();
            int y = s1.nextInt();
            int sum = x + y;
            int div;
            try {
               div = x / y;
                System.out.printf("the division is %d\n", div);
            }catch (ArithmeticException a)
            {
                System.out.println("Arithmetic Exception");

            }
            System.out.printf("the addition is %d\n", sum);


            arr = new int[5];
            arr[3]=6;
            System.out.println(arr[4]);
        }
        catch (InputMismatchException w)
        {
            System.out.println("Exception occured");
        }
        catch (ArrayIndexOutOfBoundsException t)
        {
            System.out.println("Array Exception");
        }

        name("vishal");
        }

        public  static  void name(String n) throws IllegalArgumentException
        {
            if(n.contains("-"))
            {
                throw new IllegalArgumentException("name contains -----");

            }
            System.out.println(n);

        }

    public static class exception {

        public static void main(String[] args) {
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter Values : ");
            int a=s1.nextInt();
            int b=s1.nextInt();
            int[] arr=new int[5];
            try {
                arr[4]=5;
                int divide = a / b;
                System.out.printf("The division Is : %d\n",divide);
                System.out.println(arr[4]);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.fillInStackTrace());
                System.out.println("Zero is not valid for division please enter valid number expect zero:");
            }
            catch (ArrayIndexOutOfBoundsException p)
            {
                System.out.println("Array");
            }

        }

    }
}
