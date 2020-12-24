public class MessageSubscriberTwo implements Observer
{   //YOUR CODE
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
