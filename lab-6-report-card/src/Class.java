public class Class {
    String className;
    Grade gradeLetter;

    //default constructor
    Class(){
        className = "";
        gradeLetter = new Grade();
    }

    //argument constructor
    Class(String name, Grade letter){
        className = name;
        gradeLetter = letter;
    }

    //return class name
    public String getClassName(){
        return className;
    }

    //return class grade
    public String getGrade(){
        return gradeLetter.getGrade();
    }

    //return grade as an int
    public int getGradeInt(){
        return gradeLetter.getGradeInt();
    }

    //override toString
    public String toString(){
        return className + ": " + gradeLetter.letterGrade;
    }
}
