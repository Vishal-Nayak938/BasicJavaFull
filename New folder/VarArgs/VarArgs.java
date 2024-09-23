package VarArgs;

public class VarArgs {
    public  static  void main(String... args)
    {
//        System.out.println(add(4,5));
//        System.out.println(add(new int[]{6,4}));
        System.out.printf("The Addition Is = %d",add(12,8,5,8,6,6));

    }
/** this is for varargs java automatic adds it into array it is only for convenience (... {ellipsis})*/
    public static int add(int first,int second,int... a)
    {
int sum=first+second;
        for (int i : a) {
            sum+=i;
        }

        return sum;
    }




//    public static int add(int[] a)
//    {
//        int sum=0;
//        for (int i : a) {
//            sum+=i;
//        }
//        return  sum;
//    }


    public static int add(int a,int b)
    {
        return  a+b;
    }

}
