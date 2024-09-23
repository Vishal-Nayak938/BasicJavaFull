package in.vkNayak;

import java.util.Scanner;

public class exception2 {

    public static void main(String[] args){

a();
    }

    private static void a()
    {
        b();
    }

    private static void b()
    {
c();
    }
    private static void c()
    {
d();
    }
    private static void d() throws ArithmeticException
    {

        System.out.println("enter two numbers: ");
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        int y=s1.nextInt();

        int[] arr=new int[5];
        try {
            System.out.println("The Divide Is : " + (x / y));

            arr[5]=90;
        }catch (ArithmeticException e)
        {
            System.out.println("Arinthmetic");
            e.getStackTrace();
        }
//        catch (ArrayIndexOutOfBoundsException p)
//        {
//            System.out.println("Array Index Out Of Bound!");
//        }
finally {
            System.out.println("I am out of the catch.");
        }
    }
}

//throws ArrayIndexOutOfBoundsException


//            if(i==3)
//            {
//                arr[3]=9;
//            }
//          try {
//              System.out.println(arr[i + 1]);
//          }
//
//          catch (ArrayIndexOutOfBoundsException e)
//          {
//              System.out.println("array is out of bound!");
//          }





