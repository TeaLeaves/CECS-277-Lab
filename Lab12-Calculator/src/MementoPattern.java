/**MementoPattern main method
 */
public class MementoPattern {
    public static void main(String[]args) {
        int num1 = 2;
        int num2 = 3;
        Calculator calc = new Calculator();
        calc.setnumbers(num1, num2);
        int sum = calc.add();

        //Code to backup the above addition operation (YOUR CODE)
        Calculator calc1 = new Calculator();
        calc1.setnumbers(num1, num2);
        mementoCalc backup = calc1.backUplastCalc();
        CalculatorCaretaker care = new CalculatorCaretaker();
        care.add(backup);

        System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
        num1 = 5;
        num2 = 6;
        calc.setnumbers(num1, num2);
        sum = calc.add();
        System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);

        //Code to restore the previous addition operation (YOUR CODE)
        mementoCalc previous = care.getLast();
        mementoCalc backup2 = new mementoCalc(num1, num2);
        care.add(backup2);
        int add = previous.getnum1() + previous.getnum2();

        System.out.println("The last calculation was: " + previous.getnum1() + " + "
                + previous.getnum2() + " = " + add);
    }
}