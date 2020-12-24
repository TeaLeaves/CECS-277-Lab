//Staff class extending from class Employee
public class Staff extends Employee implements EmployeeInfo{
    //instance variables
    double hourly_rate;

    /**default argument constructor
     * given no param
     */
    Staff() {
        super();
        hourly_rate = 0;
    }

    /**override argument constructors
     * @param last_name : last name of employee
     * @param first_name : first name of employee
     * @param ID_number : id of employee
     * @param hourly_rate : hourly rate of employee
     */
    Staff(String last_name, String first_name, String ID_number, double hourly_rate) {
        super(last_name, first_name, ID_number);
        setHourly_rate(hourly_rate);
    }

    //methods

    /** accessor
     * get the employee's hourly rate
     * @return the hourly rate
     */
    public double getHourly_rate() {
        return hourly_rate;
    }

    /**
     * get the monthly earning in a string format
     * @return monthly earning
     */
    public String getMonthlyEarning(){
        return String.format("%.2f", monthlyEarning());
    }

    /** mutator
     * set hourly rate
     * @param hourly_rate: the hourly rate
     */
    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    /**@Override monthlyEarning
     * @return the employee's monthly salary
     */
    public double monthlyEarning() {
        return hourly_rate * STAFF_MONTHLY_HOURS_WORKED;
    }

    /**@Override toString
     * @return the employee's id, full name, and monthly salary
     */
    public String toString() {
        return super.toString() + "\nFull time \n" + "Monthly Salary: $" + getMonthlyEarning();
    }
}