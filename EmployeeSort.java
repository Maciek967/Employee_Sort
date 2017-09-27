import java.util.*;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee employeeArray[] = {
            new Employee("Mark", "Sullivan", "(085) 7665852", 19),
            new Employee("Mark", "Carter", "(085) 5448593", 17),
            new Employee("Adam", "Sullivan", "(087) 5993454", 21),
            new Employee("Joe", "McCarthy", "(086) 9435849", 27)
        };
        
        List<Employee> employees = Arrays.asList(employeeArray);
        Collections.sort(employees);
        System.out.println("In NAME ORDER: \n");
        for(Employee e : employeeArray)
        {
            System.out.println(e);
        }
        Collections.sort(employees, new AgeComparator());
        System.out.println("\nIn AGE ORDER: \n");
        for(Employee e : employeeArray)
        {
            System.out.println(e);
        }
    }
}

