/**
 This exception reports insufficient funds
 */
public class InsufficientFundsException extends RuntimeException
{
    public InsufficientFundsException(double balance)
    {
    }

    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
