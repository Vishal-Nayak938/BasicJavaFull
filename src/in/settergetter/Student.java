package in.settergetter;

public class Student {
    private String name;
    private String fatherName;
    private int rollNo;
    private int registrationNo;

    public  Student(String name,String fatherName,int rollNo,int registrationNo)
    {
        this.name=name;
        this.fatherName=fatherName;
        this.rollNo=rollNo;
        this.registrationNo=registrationNo;
    }

    public String  getName()
    {
        return name;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNO(int rollNO)
    {
     this.rollNo=rollNO;
    }
    }
