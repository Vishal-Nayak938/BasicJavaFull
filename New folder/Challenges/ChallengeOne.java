package Challenges;

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter first value : ");
        int x=s1.nextInt();
        System.out.println("enter second value : ");
        int y=s1.nextInt();
        division(x,y);

    }

    private static void division(int a,int b)
    {

        try {
            int div=a/b;
            System.out.printf("The division is : %d", div);
        }catch (ArithmeticException e)
        {
        if(e.getMessage().equals("/ by zero"))
        {
            System.out.println("divide by zero occures.");
        }
        else{
            throw e;
        }

        }
    }
}
