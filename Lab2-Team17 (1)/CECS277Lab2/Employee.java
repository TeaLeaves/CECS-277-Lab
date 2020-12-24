public class Employee {

    //instance variable: name and salary
    private String name;
    private double salary;

    /**default constructor; given no param
     */
    Employee(){
        this.name = "Jack";
        this.salary = 1000.00;
    }

    /** overridden constructor
     * @param name = String name of the employee
     * @param salary = the employee's salary
     */
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    /**
     * @Override toString method
     * @return a string of the employee's name and salary
     */
    public String toString() {
        return "Employee{" +
                "name: " + name + '\n' +
                "salary: " + salary +
                '}';
    }

    /**
     * @return a string of the employee's name
     */
    public String getName(){
        return name;
    }

    /**
     * @return a string of the employee's salary
     */
    public double getSalary(){
        return salary;
    }

}//end class Employee
