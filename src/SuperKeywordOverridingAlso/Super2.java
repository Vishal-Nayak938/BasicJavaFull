package SuperKeywordOverridingAlso;

public class Super2 extends SuperKey1{

    void property()
    {

        System.out.println("i have 5 lakhs rupee i am child.");
    }

     Super2()
    {
        super(2);//super function;
        super.property();//super keyword use to call parent function or others;
        this.property();//this keyword refers current object;
        System.out.println("this is starting Super2");
    }
}
