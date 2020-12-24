public class MessageSubscriberOne implements Observer
{   //YOUR CODE
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
