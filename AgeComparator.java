import java.util.Comparator;
public class AgeComparator implements Comparator<Employee> 
{
    public int compare(Employee e1, Employee e2) 
    {
      int age1 = e1.getAge();
      int age2 = e2.getAge();
      if (age1 < age2) return -1;
      else if (age1 > age2) return 1;
      else return 0; 
  }
}

