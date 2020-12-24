public class Grade {
    String letterGrade;

    //default constructor
    Grade(){
        letterGrade = "N/A";
    }

    //argument constructor
    Grade(String str){
        letterGrade = str;
    }

    //return grade
    public String getGrade(){
        return letterGrade;
    }

    //return the grade as a percent
    public int getGradeInt(){
        if(letterGrade == "A"){
            return 90;
        }
        else if(letterGrade == "B"){
            return 80;
        }
        else if(letterGrade == "C"){
            return 70;
        }
        else if(letterGrade == "D"){
            return 60;
        }
        else{
            return 50;
        }
    }
}
