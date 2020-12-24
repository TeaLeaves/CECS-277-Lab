import java.util.ArrayList;

public class ReportCard {
    //values
    Student student;
    ArrayList<Class> classes = new ArrayList<Class>();

    //default constructor
    ReportCard(){
        student = new Student();
    }

    //argument constructor
    ReportCard(Student name, ArrayList<Class> classList){
        student = name;
        classes = classList;
    }

    //calculate grade average
    public double gradeAvg(){
        int sum = 0;
        double gradeAvg = 0;
        //loop through classes grades
        for(int i = 0; i < classes.size(); i++){
            sum = sum + classes.get(i).getGradeInt();
        }

        //get grade average as an int
        gradeAvg = sum/(classes.size());

        return Math.round(5.00*(gradeAvg/100.00));
    }

    public String toString(){
        String output = "";
        //add student's name
        output = output + "Name: " + student.getName() + "\n";

        //add the student's classes + grade
        for(int i = 0; i < classes.size(); i++){
            output = output + classes.get(i).toString() + "\n";
        }

        //add the students grade avg
        output = output + "Grade Average: " + gradeAvg() + "\n";

        return output;
    }
}
