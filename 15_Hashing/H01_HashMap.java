// Hashing is a method of storing and retrieving data from a database efficiently.

/*
    Hashing => Map and Set
    Map => Hashmap, LinkedHashmap and Treemap    
    Set => Hashset, LinkedHashset and Treeset

    Define :- 
    Map => HashMap <String,Integer> hm = new HashMap<>();
*/

// HashMap is used to store the key value pair.
import java.util.*;

public class H01_HashMap{
    public static void main(String args[]){

        // Create
        HashMap <String,Integer> hm = new HashMap<>();

        // Insert --> O(1)
        hm.put("Sachin",10);
        hm.put("Rohit",45);
        hm.put("Sehwag",44);

        System.out.println(hm);   //{Rohit=45, Sehwag=44, Sachin=10}

        // Get --> O(1)  get method returns null value if the key doesn't exist
        System.out.println(hm.get("Sachin")); //10
        System.out.println(hm.get("Virat"));  // null

        // containsKey --> O(1)
        System.out.println(hm.containsKey("Rohit")); // true
        System.out.println(hm.containsKey("Virat")); // false;

        // containsValue
        System.out.println(hm.containsValue(10));  // true


        // remove O(1) --> remove method removes the key value and return the value if exist and if key not exist then it will return null value
        System.out.println(hm.remove("Rohit")); //45
        System.out.println(hm);  //{Sehwag=44, Sachin=10}



        // Size --> O(1) in worst case
        System.out.println(hm.size()); //2 

        // isEmpty --> returns true or false 
        System.out.println(hm.isEmpty());  //false

        // clear --> clears the map data
        hm.clear();
        System.out.println(hm.isEmpty()); //true
    }
}  

/* In HashMap and HashSet there is no particular order in which you get the elements because its hashing and different 
    keys may go into slots in any order


    In HashMap function like get, put, contains are O(1) on average and isEmpty, size are O(1) even in worst case
 */
// One important thing about remove function is it returns the value of the corresponding key if present othewise returns null

