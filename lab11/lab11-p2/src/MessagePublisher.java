import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        //ADD o to observers
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        //REMOVE o from observers
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            //Call update method (Your Code)
            int index = observers.indexOf(o);
            observers.get(index).update(m);
        }
    }
}