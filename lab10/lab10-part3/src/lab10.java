import java.util.*;
public class lab10
{ public static void main(String [] args)
    {
        String text = "Good morning.Have a good class." + "Have a good visit.Have fun!";
        //Create a TreeMap to hold words as key and count as value
        TreeMap<String, Integer> tree = new TreeMap<>();

        //Extracting a word from a text by using the split method in the String
        //class. The words will be a, class, fun, good, Good, Have, morning and visit.
        String [] words = text.split("[ \n\t\r.,;:!?(){}]");

        // For each word extracted in the array words
        for(String word : words){
            word = word.toLowerCase();
            // Check whether it is already in the stored as a key in the map (use containsKey).
            if(tree.containsKey(word)){
                //if it is, increment count by 1
                tree.put(word, tree.get(word)+1);
            }
            // If not, a new pair is stored in the map
            else {
                //pair consist of the word and it initial count
                tree.put(word, 1);
            }

            //output the values in the tree set
            System.out.println(tree);
        }

        //separator to make it neat
        System.out.println("-------------------------------");
        // Write code to obtain entries of the map in a set
        // traverse the set to display the key & count in each entry.entries into a set
        for(Map.Entry<String, Integer> e : tree.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }//end main
}//end class