/**
 * CECS 277
 * FAll 2020
 * Lab Assignment 3
 * Tina L Vu
 * 09/16/20
 */
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        //time the entire program
        long start = System.nanoTime();

        //create an arraylist of class Employee
        ArrayList<Employee> Employ = new ArrayList<Employee>();

        //store Staff
        Employ.add(new Staff("Allen", "Paita", "123", 50.00));
        Employ.add(new Staff("Zapata", "Steven", "456", 35.00));
        Employ.add(new Staff("Rios", "Enrique", "789", 40.00));

        //store Faculty
        Employ.add(new Faculty("Johnson", "Anne", "243", Faculty.Levels.FU, "Ph.D", "Engineering", 3));
        Employ.add(new Faculty("Bouris", "William", "791", Faculty.Levels.AO, "Ph.D", "English", 1));
        Employ.add(new Faculty("Andrade", "Christopher", "623", Faculty.Levels.AS, "MS", "Physical Education", 0));

        //store Partime
        Employ.add(new Partime("Guzman", "Augusto", "455", 35.00, 30));
        Employ.add(new Partime("Depirro", "Martin", "678", 30.00, 15));
        Employ.add(new Partime("Aldaco", "Marque", "945", 20.00, 35));

        //my neat output
        for(int j = 0; j < Employ.size(); j++){
            System.out.println("Last Name: " + Employ.get(j).getLast_name());
            System.out.println("First Name: " + Employ.get(j).getFirst_name());
            System.out.println("ID Number: " + Employ.get(j).getID_number());
            if(Employ.get(j) instanceof Staff ){
                System.out.printf("Hourly Rate: $%.2f", ((Staff) Employ.get(j)).getHourly_rate());
            }
            else if(Employ.get(j) instanceof Partime ){
                System.out.printf("Hourly Rate: $%.2f", ((Partime) Employ.get(j)).getHourly_rate());
                System.out.println("Hrs Worked Per Week: " + ((Partime) Employ.get(j)).getHours_work_per_week());
            } else if(Employ.get(j) instanceof Faculty){
                System.out.println("" + ((Faculty) Employ.get(j)).getString());
            } else{
                System.out.println("Done");
            }
            System.out.println("\n");
        }

        System.out.println("------------------------------------------------------\n");
        //a)display employee's information using the method toString
        System.out.println("a)display employee's information using the method toString\n");

        for(int j = 0; j < Employ.size(); j++){
            System.out.println(Employ.get(j).toString());
            System.out.println("\n");
        }

        //to make it neat
        System.out.println("------------------------------------------------------\n");

        //b & c) finding total monthly salary of part time staffs and all staffs
        System.out.println("b & c) finding total monthly salary of part time staffs and all staffs");

        double total_Monthly_PartTime_Salary = 0.00;
        double total_Monthly_Salary = 0.00;
        //adding it all up
        for(int i = 0; i < Employ.size(); i++){
            //add total monthly salary for all the part-timer staff
            if(Employ.get(i) instanceof Partime){
                total_Monthly_PartTime_Salary += Employ.get(i).monthlyEarning();
            }
            //add total monthly salary for all employees
            total_Monthly_Salary += Employ.get(i).monthlyEarning();
        }
        //printing out answer for question b & c
        System.out.printf("\nTotal Monthly Salary for All Part-time Staff: $%.2f",total_Monthly_PartTime_Salary);
        System.out.printf("\nTotal Monthly Salary for All Employee: $%.2f", total_Monthly_Salary);

        //to make it neat
        System.out.println("\n");
        System.out.println("\n------------------------------------------------------\n");

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("Runtime: " + time + "ns");
    }
}
