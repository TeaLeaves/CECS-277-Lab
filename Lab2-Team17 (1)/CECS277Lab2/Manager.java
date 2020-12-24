//create Manager class that extends from Employee class
public class Manager extends Employee{
    //instance variable
    public String department;

    //argument Manager constructor
    Manager(){
        super(); //call employee class
        department = "Finance";
    }

    //argument Manager constructor
    public Manager(String name, Double salary){
        super(name,salary); //call Employee(name, salary)
        department = "Finance";
    }

    /**
    * @Override toString method
    * @return a string of the manager's name, department, and salary
    */
    public String toString() {
        return "Manager{" +
                "name: " + super.getName() + '\n' +
                "department: " + department + '\n' +
                "salary: " + super.getSalary() +
                '}';
    }
} //end Manager class
