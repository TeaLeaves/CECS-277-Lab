import java.util.ArrayList;
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    /**
     * Template method Pattern - Sequence of processes.
     * To define the sequence to prepare Pizza.
     */
    public final void pizzaPrepare() {
        /*Prepare Pizza */
        prepare();

        /*Bake the Pizza. */
        bake();
    }

    public abstract void prepare();

    public abstract void bake();
}