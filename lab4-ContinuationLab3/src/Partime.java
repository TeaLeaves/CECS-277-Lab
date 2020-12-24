public class Partime extends Staff{
    //instance variables
    private int hours_work_per_week;

    /**default argument constructor
     * given no param
     */
    public Partime(){
        super();
        this.hours_work_per_week = 0;
    }

    /**override argument constructors
     * @param last_name: employee's last name
     * @param first_name: employee's first name
     * @param ID_number: employee's ID number
     * @param hourly_rate: the employee's hourly rate
     * @param hours_work_per_week: the employee's total hours of work per week
     */
    public Partime(String last_name, String first_name, String ID_number, double hourly_rate, int hours_work_per_week) {
        super(last_name, first_name, ID_number, hourly_rate);
        setHours_work_per_week(hours_work_per_week);
    }

    //methods

    /**accessors: get the employee's total hours of work per week
     * @return hours in int
     */
    public int getHours_work_per_week() {
        return hours_work_per_week;
    }

    /**
     * get the monthly earning in a string format
     * @return monthly earning
     */
    public String getMonthlyEarning(){
        return String.format("%.2f", monthlyEarning());
    }

    /**mutators: set the employee's total hours of work per week
     * @param hours_work_per_week: the int used to set it
     */
    public void setHours_work_per_week(int hours_work_per_week) {
        this.hours_work_per_week = hours_work_per_week;
    }

    /**@Override monthlyEarning
     * @return monthly salary: the hourly rate times the hours worked in 4 weeks
     */
    public double monthlyEarning() {
        return hourly_rate*(hours_work_per_week*4);
    }

    /**@Override toString
     * @return Employee's ID, Name, hours worked per month, and monthly salary
     */
    public String toString() {
        return "ID Employee Number: " + ID_number + "\nEmployee Name: " +
                first_name + " " + last_name + "\nHours Works Per Month: " +
                hours_work_per_week + "\nMonthly Salary: $" + getMonthlyEarning();
    }
}