public class MessageSubscriberThree implements Observer
{   //YOUR CODE
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}
