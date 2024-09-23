public class VarArgs {

    public static void sum(int first,int second,int... a)
    {
        int sum=first+second;
        for (int i : a) {
            sum+=i;
        }

        System.out.printf("The Addition Is : %d\n",sum);
    }


    public static void main(String... args)
    {
        sum(2,4);
        sum(2,4,8,9,6);
        sum(2,4,7,5);
        sum(2,5,9,7);
    }
}
