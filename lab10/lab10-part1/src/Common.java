import java.util.Set;
import java.util.HashSet;
public class Common {
    /**
     * create a new set that contains only the items the two sets have
     * in common.
     * @param s1: the first set to compare
     * @param s2: the second set we are comparing s1 with
     * @return the new set
     */
    public static Set<String> intersection(Set<String> s1, Set<String> s2){
        //create an empty set
        Set<String> s3 = new HashSet<String>();

        //for every single string in set 1
        for(String single: s1){
            //if that single string is in set 2
            if(s2.contains(single) == true){
                //add it to the new set
                s3.add(single);
            }
        }

        //return the set
        return s3;
    }

    public static void main(String args[])
    {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        s1.add("aa");
        s1.add("bb");
        s1.add("cc");
        s2.add("dd");
        s2.add("cc");
        s2.add("bb");
        Set<String> s3 = new HashSet<String>();
        s3 = intersection(s1,s2);
        System.out.println(s3);
    }
}
