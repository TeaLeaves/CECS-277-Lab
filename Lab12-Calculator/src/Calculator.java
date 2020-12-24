/** Memento class contains functions
 */
public class Calculator {
    private int num1;
    private int num2;

    /**
     * Method adds two numbers
     *
     * @return sum
     */
    public int addTwoNumbers() {
        return num1 + num2;
    }

    /**
     * Method replaces numbers with new values
     *
     * @param num1
     * @param num2
     */
    public void setnumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Method returns mementoCalc object with current numbers
     *
     * @return mementoCalc object of num1 and num2
     */
    public mementoCalc backUplastCalc() {
        return new mementoCalc(num1, num2);
    }

    /**
     * Restores two numbers from mementoCalc object
     *
     * @param mem mementoCalc object
     */
    public void restorePreviousCalc(mementoCalc mem) {
        num1 = ((mementoCalc) mem).getnum1();
        num2 = ((mementoCalc) mem).getnum2();
    }

    public int add() {
        return num1 + num2;
    }
}