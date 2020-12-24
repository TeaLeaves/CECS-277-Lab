/**
   A class to test the BankAccount class.
*/
public class BankAccountTester2
{
   public static void main(String[] args)
   {  //start runtime
      long start = System.nanoTime();
      BankAccount harrysChecking = new BankAccount();

      try
      {
         harrysChecking.deposit(300);
         System.out.println("success");
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: success");

      try
      {
         harrysChecking.withdraw(100);
         System.out.println("success");
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: success");

      try
      {
         harrysChecking.deposit(-100);
         System.out.println("success");
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: exception");

      try
      {
         harrysChecking.withdraw(300);
         System.out.println("success");
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("exception");
      }
      System.out.println("Expected: exception");

      //calculate runtime
      long end = System.nanoTime();
      long time = end - start;
      //runtime output
      System.out.println("\n");
      System.out.println("Runtime: " + time + "ns");
   }
}
