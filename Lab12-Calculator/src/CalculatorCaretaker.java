import java.util.ArrayList;
import java.util.List;
/** Caretaker class
 */
public class CalculatorCaretaker {
    List<mementoCalc> list = new ArrayList<mementoCalc>();

    /**Adds mementoCalc object to list
     * @param m mementoCalc object
     */
    public void add(mementoCalc m) {
        list.add(m);
    }

    /**Returns last mementoCalc object
     * @return mementoCalc object
     */
    public mementoCalc getLast() {
        return list.get(list.size()-1);
    }
}