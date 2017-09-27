import java.util.*;
public class Employee implements Comparable<Employee>
{
    String firstName, lastName, phoneNumber;
    int age;

    public Employee(String f, String l, String p, int a)
    {
        this.firstName = f;
        this.lastName = l;
        this.phoneNumber = p;
        this.age = a;
    }

    public Employee(String firstName, String lastName) 
    {
        if (firstName == null || lastName == null)
            throw new NullPointerException();
            this.firstName = firstName;
            this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public int getAge()
    {
        return age;
    }
    
     public boolean equals(Object o) {
        if (!(o instanceof Employee)){
            return false;}
        Employee e = (Employee)o;
        return e.firstName.equals(firstName) &&
               e.lastName.equals(lastName);
    }
    
    public String toString() 
    {
         return lastName + ", " + firstName + " is " + age + " years old";
    }

    public int compareTo(Employee e) 
    {
        int lastCmp = lastName.compareTo(e.getLastName());
        return (lastCmp != 0 ? lastCmp :
                firstName.compareTo(e.getFirstName()));
    }
}
