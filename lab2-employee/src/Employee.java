/**
 * CECS 277
 * FAll 2020
 * Lab Assignment 2
 * Tina L Vu
 * Steven Yacoub
 * 09/09/20
 */
public abstract class Employee {

    //instance variable: name and salary
    private String name;
    private double salary;

    /**default constructor
     * given no param
     */
    Employee(){
        String name;
        double salary;
    }

    /** overrided constructor
     * @param name = String name of the employee
     * @param salary = the employee's salary
     */
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //methods

    /**
     * @Override toString method
     * @return a string of the employee's name and salary
     */
    public String toString() {
        return "Employee{" +
                "name:'" + name + '\'' +
                ", salary: " + salary +
                '}';
    }
    //end class Employee

    //create manager class that extends from employee class
    public class Manager extends Employee{
        //instance variable
        private String department;


    }

}
