package in.knowledgeGate;

public  class SecondObjectedClass {

     String name;
    private int rollNO;
    private int registrationNo;
    private String fatherName;
    public SecondObjectedClass(String name, int registrationNo,int rollNO,String fatherName)
    {
        this.name=name;
        this.registrationNo=registrationNo;
        this.rollNO=rollNO;
        this.fatherName=fatherName;
    }
    public void student()
    {
        System.out.println("name: "+name+"\nregistration no: "
                +registrationNo+"\nroll no: "+rollNO+" \nfather name: "+fatherName);
    }

}
