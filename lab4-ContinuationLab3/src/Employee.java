import java.util.Comparator;

public abstract class Employee implements Comparator {
    //instance variables
    String last_name;
    String first_name;
    String ID_number;

    /**default argument constructor
     * given no param
     */
    Employee(){
        String last_name = "";
        String first_name = "";
        String ID_number = "";
    }

    /**override argument constructors
     * @param last_name: the last name of the employee (String)
     * @param first_name: the first name of the employee (String)
     * @param ID_number: the ID number of the employee (String)
     */
    Employee(String last_name, String first_name, String ID_number){
        setLast_name(last_name);
        setFirst_name(first_name);
        setID_number(ID_number);
    }

    //public methods (include mutators and accessors)

    /**
     * @Overrided toString
     * @return a string of the employee's id number and full name
     */
    public String toString() {
        return "ID Employee number: " + ID_number +
                "\nEmployee Name: " + first_name + " " +
                last_name;
    }

    //mutators
    //set first name of employee
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    //set last name of employee
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    //set id of employee
    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    //accessors
    //get first name of employee
    public String getFirst_name() {
        return first_name;
    }

    //get last name of employee
    public String getLast_name() {
        return last_name;
    }

    //get id of employee
    public String getID_number() {
        return ID_number;
    }

    //body in child methods will return monthly wage
    abstract public double monthlyEarning();

    //use to sort id in ascending order using comparable
    public int compareTo(Employee id){
        return Integer.parseInt(ID_number) - Integer.parseInt(id.getID_number());
    }

    //use to sort last name in descending order using comparator
    public static int compare(Employee last1, Employee last2){
        return last1.getLast_name().compareTo(last2.getLast_name());
    }


}
