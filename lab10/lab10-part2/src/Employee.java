import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Employee implements Comparable<Employee>
{
    //values
    String name;
    double salary;

    //constructor
    public Employee(String name, double s)
    {
        this.name = name;
        salary = s;
    }

    //overwritten toString method
    public String toString()
    {
        return ( this.name + "," + this.salary);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary > o.salary){
            return 1;
        }
        else if(this.salary < o.salary){
            return -1;
        }
        else {
            return 0;
        }
    }

    //main class
    public static void main(String[] args) {
        //create a TreeSet object called emp
        TreeSet emp = new TreeSet();

        //add three Employee objects  in the following order to the TreeSet emp :
        //Name: eee
        //Salary: 78000.0
        emp.add(new Employee("eee",78000.0));

        //Name: bbb
        //Salary: 45000.0
        emp.add(new Employee("bbb",45000.0));
        //Name: ccc
        //Salary: 100000.0
        emp.add(new Employee("ccc",100000.0));

        //Display the Employee objects (names and salary) using an iterator.
        Iterator<Employee> i = emp.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}//end class
