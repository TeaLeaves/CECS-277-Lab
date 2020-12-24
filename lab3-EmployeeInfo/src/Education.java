public class Education {
    //instance variables
    private String Degree;
    private String Major;
    private int Research;

    /**default argument constructor
     * given no param
     */
    Education() {
        Degree = "";
        Major = "";
        Research = 0;
    }

    /**override argument constructors
     * @param degree: the degree of the employee (MS or PhD)
     * @param major: the major they took (EX. Engineering, English, etc.)
     * @param research: number of researches made
     */
    Education(String degree, String major, int research) {
        setDegree(degree);
        setMajor(major);
        setResearch(research);
    }

    //accessors
    /**
     * get the degree of the employee
     * @return that degree as a string; either MS or PhD
     */
    public String getDegree() {
        return Degree;
    }

    /**
     * get the major of that employee
     * @return the major as a string
     */
    public String getMajor() {
        return Major;
    }

    /**
     * get the number of researches that employee had made
     * @return an integer that represent the number of researches
     */
    public int getResearch() {
        return Research;
    }

    //settors
    //set the degree of the employee with the given param
    public void setDegree(String degree) {
        Degree = degree;
    }

    //set the major of the employee with the given param
    public void setMajor(String major) {
        Major = major;
    }

    //set the researched number w/the given param
    public void setResearch(int research) {
        Research = research;
    }
}