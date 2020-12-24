import java.io.*;
import java.util.*;

public class SalesSplit{
    /**
     Prompts for and reads name of file to process.
     @param in Scanner from which to read
     @return file name
     */
    private static String getFileName(Scanner in)
    {
        String filename = null;
        System.out.print("Enter file to process: ");
        if (in.hasNext()) {
            filename = in.next();
        }
        return filename;
    }

    /**
     Read a sales entry from input Scanner.
     @param in Scanner from which to read entry
     */
    private static Sale readSaleEntry(Scanner in){
        String inputLine = in.nextLine();
        Scanner lineScan = new Scanner(inputLine);
        lineScan.useDelimiter(";");

        //YOUR CODE TO INPUT name, service, amount, and date.
        //call name + grab it from scanner
        String name = lineScan.next();
        //call service + grab it from scanner
        String service = lineScan.next();
        //call amount + + grab it from scanner
        double amount = lineScan.nextDouble();
        //call date + grab it from scanner
        String date = lineScan.next();

        return new Sale(name, service, amount, date);
    }

    /**
     Reads sales data from the specified file.
     @param filename name of sales data file
     */
    private static ArrayList<Sale> readSalesFile(String filename)
            throws FileNotFoundException
    {
        ArrayList<Sale> sales = new ArrayList<Sale>();

        if (filename != null) {
            //fill in the blank below
            try (Scanner infile = new Scanner(new File(filename)))
            {
                while (infile.hasNext()){
                    //fill in the blank below
                    sales.add(readSaleEntry(infile));
                }
            }
        }
        return sales;
    }


    /**
     Writes sale to writer.
     @param out PrintWriter to which sale is written
     @param sale sale information
     */
    private static void writeSale(PrintWriter out, Sale sale)
    {
        out.print(sale.getName());
        out.print(";");
        out.print(sale.getServiceCategory());
        out.print(";");
        out.print(sale.getAmount());
        out.print(";");
        out.print(sale.getDate());
        out.println();
    }

    public static void main(String[] args)
    {
        //start runtime
        long start = System.nanoTime();

        //test to see if the file exist or nah
        try
        {
            Scanner in = new Scanner(System.in);
            String filename = getFileName(in);
            System.out.println(filename);
            //create a new text file
            PrintWriter salesoutput = new PrintWriter("salesoutput.txt");
            //create an array
            ArrayList<Sale> sales = readSalesFile(filename);
            for (Sale s : sales) {
                //print out the output
                System.out.println(s);
                //add it to salesoutput.txt file
                salesoutput.println(s);
            }
            //close the new file that was made
            salesoutput.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("File format not valid.");
        }

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("\n");
        System.out.println("Runtime: " + time + "ns");
    }
}