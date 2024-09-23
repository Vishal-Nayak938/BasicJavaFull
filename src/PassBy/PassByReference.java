package PassBy;

public class PassByReference {

    public static void main(String args[])
    {
        ToTestPassByValue t1=new ToTestPassByValue();
        testPassByReference(t1);

    }

    static void testPassByReference(ToTestPassByValue P)
    {
        P.testPassByValue();

    }
}
