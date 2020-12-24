/**
 This exception reports a negative amount
 */
public class NegativeAmountException extends RuntimeException
{
    public NegativeAmountException()
    {
    }

    public NegativeAmountException(String message)
    {
        super(message);
    }
}
