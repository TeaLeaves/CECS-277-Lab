/**
 * A class to test the CashRegister class.
 */
public class CashRegisterTester
{
    public static void main(String[] args){
        //time the entire program
        long start = System.nanoTime();

        final Coin DOLLAR = new Coin(1.0, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");

        CashRegister register = new CashRegister();

        register.recordPurchase(1.95);
        register.recordPurchase(1.40);
        register.receivePayment(3, DOLLAR);
        register.receivePayment(2, QUARTER);

        double change = register.giveChange();

        System.out.println("Output: $" + change);
        System.out.println("Expected: $0.15");

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("Runtime: " + time + "ns");
    }
}
