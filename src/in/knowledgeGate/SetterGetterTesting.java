package in.knowledgeGate;

import in.settergetter.*;

public class SetterGetterTesting {
    public static void main(String[] args) {
        Student s = new Student("Vishal kumar", "Rajendra kumar", 98, 23671);
        System.out.printf("%s, %s\n",s.getName(),s.getRollNo());
        s.setRollNO(78);

        System.out.println(s.getRollNo());
    }

}
