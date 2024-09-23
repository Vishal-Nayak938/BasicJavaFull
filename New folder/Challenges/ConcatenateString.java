package Challenges;

public class ConcatenateString {
    public  static void concatenateString(String... name)
    {
        StringBuilder s1=new StringBuilder();
        for (String s : name) {
            System.out.printf("%s ",s);
        }
        System.out.println();
    }

    public static  void main(String ...args)
    {
concatenateString("vishal","nayak","kumar");
        concatenateString("a","b","c","d","e","f");
    }
}
