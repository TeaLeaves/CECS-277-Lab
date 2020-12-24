import java.util.Scanner;
import java.util.InputMismatchException;

public class DataReader
{
    public static void main(String[] args)
    {   //start runtime
        long start = System.nanoTime();

        //start scanner
        Scanner in = new Scanner(System.in);

        int chances = 0;
        boolean done = false;
        double sum = 0;

        while (!done) {
            while(chances < 2) {
                double value = 0;
                try {
                    //Input the double value
                    System.out.print("Enter a Value: ");
                    value = in.nextFloat();
                    //Accumulate
                    sum = sum + value;
                } catch (InputMismatchException e) {
                    //Display "Input error. Try again."
                    System.out.println("Input error. Try again.");
                    //Read the bad input
                    in.next();
                    chances++;
                }
            }
            done = true;
        }
        //Display the sum
        System.out.println("Sum: " + sum + "\n");

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("\n");
        System.out.println("Runtime: " + time + "ns");
    }
}
