/******************************************************************************
 CECS 277
 Fall 2020
 Lab assignment 1
 Tina L Vu
 08/26/20
 *******************************************************************************/
import java.util.ArrayList;
public class Student
{
    private String name;
    private String id;

    //constructor w/2 arguments
    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
    }


    //copy constructor
    public Student(Student other)
    {
        this.name = name;
        this.id = id;
    }


    //return the student's name as a string
    public String getName()
    {
        return name;
    }


    //return the student's id as a string
    public String getID()
    {
        return id;
    }


    //return a string of student name and id
    public String toString()
    {
        return this.getName()+" "+this.getID();
    }


    //verify if two objects are identical
    public boolean equals(Object other)
    {
        boolean result = false;
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            result = id.equals(((Student) other).getID());
        }
        return result;
    }


    //main method
    public static void main(String[] args)
    {
        //create 2 student objects
        Student one = new Student("Tina","1234");
        Student two = new Student("Michelle", "5678");

        Student three = one;

        //display 3 students objects
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        //verify if 2 students are identical
        if(one.equals(two)){
            System.out.println("\nStudent one = Student two\n");
        }
        if(one.equals(three)){
            System.out.println("\nStudent one = Student three\n");
        }
        if(two.equals(three)){
            System.out.println("\nStudent two = Student three\n");
        }

        //create arraylist object
        ArrayList array = new ArrayList();

        //add three students objects to the arraylst
        array.add(one);
        array.add(two);
        array.add(three);

        //display all objects in the ArrayList
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i).toString());
        }

    }
}