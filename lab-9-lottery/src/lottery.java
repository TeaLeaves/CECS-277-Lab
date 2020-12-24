import java.text.DecimalFormat;
import java.util.*;

public class lottery {
    //Winning numbers should be between 1 and 40
    public static Set<Integer> generateWinningNumbers( ){
        //create a list
        Set<Integer> ticket = new LinkedHashSet<Integer>();

        //randomly generate 6 numbers
        while(ticket.size()<6){
            //add the random number into the list
            ticket.add((int)(Math.random()*(40-1))+1);
        }

        return ticket;
    }

    //Read the player's lottery ticket from the console
    public static Set<Integer> getTicket( ){
        //temp input holder
        int input = 0;

        //open scanner
        Scanner in = new Scanner(System.in);
        //prompt the user to enter 6 lotto numbers

        System.out.println("Enter Your 6 Lotto Numbers (1-40): ");

        //create a list
        Set<Integer> ticket = new LinkedHashSet<Integer>();
        //get the lotto numbers
        for(int i = 0; i < 6; i++){
            boolean valid = false;
            while( !valid ) {
                if( in.hasNextInt() ) {
                    input = in.nextInt();
                    //make sure the number is in range
                    if( input <= 40 && input >= 1 ) {
                        valid = true;
                    } else {
                        System.out.print( "Invalid: " );
                    }
                } else {
                    in.next(); //clear invalid string
                    System.out.print( "Invalid: " );
                }
            }
            //add the lotto number into the array
            ticket.add(input);
        }
        return ticket;
    }

    public static void main(String[] args) {
        //start runtime
        long start = System.nanoTime();

        //generate random winning lottery ticket
        Set<Integer> winning = generateWinningNumbers();

        //prompt user for lottery ticket numbers
        Set<Integer> ticket = getTicket();

        //create the ticket
        System.out.println("Your Ticket Is: ");
        System.out.println(ticket);
        System.out.print("\n");

        //show the winning numbers
        System.out.println("           o       o                        ");
        System.out.println("           |      /                         ");
        System.out.println("           |     /                          ");
        System.out.println("           |____/                           ");
        System.out.println(" __________________________________________ ");
        System.out.println("|                                          |");
        System.out.println("|   ------------------------------------   |");
        System.out.println("|  |                                    |  |");
        System.out.println("|  |                                    |  |");
        System.out.println("|  |      The Winning Numbers are:      |  |");
        System.out.println("|  |                                    |  |");
        System.out.print("|  |     ");
        System.out.printf("%-28s %s\n", winning,"  |  |");
        System.out.println("|  |                                    |  |");
        System.out.println("|  |                                    |  |");
        System.out.println("|   ------------------------------------   |");
        System.out.println("|                                          |");
        System.out.println(" __________________________________________ ");
        System.out.println("   |    |                          |    |   ");
        System.out.println("    ----                            ----    ");
        System.out.print("\n");

        //create a new set to hold the winning numbers
        Set<Integer> matches = new HashSet<Integer>(winning);
        //check how many numbers are the same
        matches.retainAll(ticket);
        System.out.println("Matches Are: " + matches);

        //higher num of matches = more $$ prize
        double prize = Math.pow(22.3606,matches.size());
        if(prize == 1){
            prize = 0;
        }
        DecimalFormat moneyFormat = new DecimalFormat("###,###,###,###.00");
        System.out.println("Your Prize is: $" + moneyFormat.format(prize));

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("Runtime: " + time + "ns");
    }

}
