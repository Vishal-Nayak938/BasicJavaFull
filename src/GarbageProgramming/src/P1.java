import java.util.Scanner;

class P1{
    public static void main(String args[])
    {
System.out.println("hello this is vishal nayak-");

    }

    /** Vishal Nayak */
    public static class Palindrome {
        /** it is main function */
        public static void main(String[] args) {
            Scanner s1 = new Scanner(System.in);
            System.out.print("Enter any number/name to check palindrome or not: ");
            String str = s1.next();
    //        System.out.println(str.charAt(3));
           System.out.println("Your Name/Number Is "+(palindrome(str) ? "P1.Palindrome": "Not P1.Palindrome;"));

        }
        static boolean palindrome(String str)
        {
            System.out.println(".");
            if(str.length()==1){
            return  true;}
            int lastPos=str.length()-1;
            if(str.charAt(0) != str.charAt(lastPos))
            {
                return false;
            }
       String newString=str.substring(1,lastPos);
    return palindrome(newString);

        }
    }
}