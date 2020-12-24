import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //start runtime
        long start = System.nanoTime();

        //add a student
        Student student1 = new Student("Micheal Le");

        //make a list of classes the student takes
        ArrayList<Class> classes = new ArrayList<Class>();

        //create new classes for the list
        Class class1 = new Class("ART 101", new Grade("A"));
        Class class2 = new Class("HIST 150", new Grade("B"));
        Class class3 = new Class("ENGR 350", new Grade("A"));
        Class class4 = new Class("BAKE 405", new Grade("C"));

        //add new classes into the list
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);
        classes.add(class4);

        //generate the report card
        System.out.println(new ReportCard(student1, classes).toString());

        //calculate runtime
        long end = System.nanoTime();
        long time = end - start;
        //runtime output
        System.out.println("Runtime: " + time + "ns");
    }
}
