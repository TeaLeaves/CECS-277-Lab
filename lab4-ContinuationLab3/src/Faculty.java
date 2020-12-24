public class Faculty extends Employee implements EmployeeInfo{

    //constants
    public enum Levels{
        AS, AO, FU, NA
    }
    private Education education;
    private Levels lvlEducation;

    /**default argument constructor
     * given no param
     */
    public Faculty(){
        super();
        this.lvlEducation = Levels.NA;
        this.education = new Education();
    }

    /**override argument constructors
     * @param last_name: employee's last name
     * @param first_name: employee's first name
     * @param ID_number: employee's id number
     * @param lvlEducation: employee's level of education
     */
    public Faculty(String last_name, String first_name, String ID_number, Levels lvlEducation, String degree, String major, int research){
        super(last_name, first_name, ID_number);
        setlvlEducation(lvlEducation);
        this.education = new Education(degree, major, research);
    }

    //methods
    //accessors
    public Levels getlvlEducation() {
        return lvlEducation;
    }

    //mutators
    public void setlvlEducation(Levels edu) {
        lvlEducation = edu;
    }

    /**@Override monthlyEarning
     * @return that faculty monthly salary * level of education
     */
    public double monthlyEarning() {
        if(lvlEducation == Levels.AS){
            return FACULTY_MONTHLY_SALARY;
        } else if (lvlEducation == Levels.AO){
            return FACULTY_MONTHLY_SALARY * 1.5;
        } else if (lvlEducation == Levels.FU){
            return FACULTY_MONTHLY_SALARY * 2.0;
        }
        return 0;
    }

    /**@Override toString
     * @return a String w/ID, Full name, lvl of Education, Degree, Major, & num of research
     */
    public String getString() {
        return "Level: " + lvlEducation +
                "\nDegree: " + education.getDegree() + "\nMajor: " + education.getMajor() +
                "\nResearches: " + education.getResearch();
    }

    /**
     * get the monthly earning in a string format
     * @return monthly earning
     */
    public String getMonthlyEarning(){
        return String.format("%.2f", monthlyEarning());
    }

    @Override
    public String toString(){
        switch (lvlEducation){
            case AS:
                return super.toString() + "\nLevel: ASSISTANT" + "\nMonthly Salary: $" +
                        getMonthlyEarning();
            case AO:
                return super.toString() + "\nLevel: ASSOCIATE"  + "\nMonthly Salary: $" +
                        getMonthlyEarning();
            case FU:
                return super.toString() + "\nLevel: FULL"  + "\nMonthly Salary: $" +
                        getMonthlyEarning();
        }
        return lvlEducation + "\n";
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}