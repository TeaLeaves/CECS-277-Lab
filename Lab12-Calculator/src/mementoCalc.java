/** Memento calculator originator class
 */
public class mementoCalc {
    private int num1;
    private int num2;

    /**Constructor
     * @param num1
     * @param num2
     */
    public mementoCalc(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
    }

    /**Method returns the first number
     * @return num1
     */
    public int getnum1() {
        return num1;
    }

    /**Method returns the second number
     * @return num2
     */
    public int getnum2() {
        return num2;
    }

    /**Method replaced num1 with new value
     * @param num1
     */
    public void setnum1(int num1) {
        this.num1 = num1;
    }

    /**Method replaced num2 with new value
     * @param num2
     */
    public void setnum2(int num2) {
        this.num2 = num2;
    }
}