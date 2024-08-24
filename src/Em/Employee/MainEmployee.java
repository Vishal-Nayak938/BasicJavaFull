package Em.Employee;

public class MainEmployee {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("vishal kumar");
        e1.setAge(23);
        e1.setSalary(230000);


        System.out.println( "Employee Name Is : "+e1.getName());
        System.out.println( "Employee Age Is : "+e1.getAge());
        System.out.println("Employee Salary Is : "+ e1.getSalary());
    }

}
