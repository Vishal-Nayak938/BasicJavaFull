package ObjectClass;

import java.util.Objects;

public class Person
{
    private String name;
    private int age;
    private String id;

    public Person(String name,int age,String id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
String setName(String name)
{
    this.name=name;
    return this.name;
}

    @Override
    public boolean equals(Object obj) //obj==p2
        {
            if (!(obj instanceof Person)) {
                return false;
            }
            Person per = (Person) obj;
            return per.name.equals(name) && per.age == age && per.id.equals(id);

        }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String toString()
    {
       StringBuilder sb=new StringBuilder("The Person Information Is:\n");
       sb.append("the name is: ").append(name);
       sb.append("\nthe age is: ").append(age);
       sb.append("\nthe id is: ").append(id);
       return sb.toString();
    }

}
