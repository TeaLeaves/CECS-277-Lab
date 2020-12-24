import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program takes in a list of baby names
 * and outputs a list of boys and girls names.
 */
public class BabyNames
{
    /**
     * Reads name information and returns it. It also consumes the
     * count values on the input line.
     * @return the next name
     */
    public static String processName(Scanner in)
    {
        //get the name
        String name = in.next();
        //pass through the integer
        in.nextInt();
        //pass through the 0.0
        in.nextDouble();
        //return the name
        return name;
    }

    public static void main(String[] args)
    {
        //start runtime
        long start = System.nanoTime();

        //test if there is a file with that name or nah
        try (Scanner in = new Scanner(new File("babynames.txt"));
             PrintWriter boyOut = new PrintWriter("boynames.txt");
             PrintWriter girlOut = new PrintWriter("girlnames.txt"))
        {
            while (in.hasNextInt())
            {
                int rank = in.nextInt();

                // System.out.println(processName(in));
                // System.out.println(processName(in));

                //add the name into the text file
                boyOut.println(processName(in));
                girlOut.println(processName(in));
            }
            in.close();
            boyOut.close();
            girlOut.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("Runtime: " + time + "ns");
    }
}