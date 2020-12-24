public class Main
{
    public static void main(String[] args)
    {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        //Attache s1 and s2 to p (YOUR CODE)
        p.attach(s1);
        p.attach(s2);

        //Notify s1 and s2 with the message "First Message"
        s1.update(new Message("First Message"));
        s2.update(new Message("First Message"));

        //Deattach s1
        p.detach(s1);

        //just to make it neat
        System.out.println();

        //Attach s3
        p.attach(s3);

        //Notify s2 and s3 with message "Second Message"
        s2.update(new Message("Second Message"));
        s3.update(new Message("Second Message"));
    }
}