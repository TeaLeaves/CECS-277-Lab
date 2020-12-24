public class Student {
    String studentName;

    //default constructor
    Student(){
        studentName = "";
    }

    //argument constructor
    Student(String name){
        studentName = name;
    }

    //return the students name
    public String getName(){
        return studentName;
    }
}
