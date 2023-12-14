// HashSet in Java
// HashSet is used to store only a set of keys, it uses hashing(Hashtables to store those keys)
// HashSet is the implemented by HashMap in which keys are the keys of Set whereas values have dummy values.

import java.util.*;
import java.util.HashSet;

public class H03_HashSet {
    public static void main(String args[]){

        // Defining Hashset
        HashSet <String> hs = new HashSet<String>();   // data type used should be non primitive, user defined are also allowed.
        // we can aslo specify the capacity(size of hashtable) in parenthesis for optimization. Example --> HashSet <String> hs = new HashSet<String>(20);

        // adding items --> add function return true if item is added, It ignores item if it is already present in the Hashtable and returns false.
        hs.add("java"); hs.add("is"); hs.add("very fast");
        
        // printing HashSet
        System.out.println(hs);

        // Adding existing item returns false
        System.out.println(hs.add("java"));   // false
        System.out.println(hs.add("than other"));  // true

        // contains
        System.out.println(hs.contains("java"));  

        // Iterator
        Iterator<String> i = hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }

        // size()
        System.out.println(hs.size());

        // remove() --> it removes the item and returns true if the item exit else returns false
        System.out.println(hs.remove("than other"));   // true
        System.out.println(hs.remove("ok"));        // false


        // Traversing HashSet by for each loop
        for ( String s : hs)
            System.out.println(s);

        // isEmpty()
        System.out.println(hs.isEmpty());

        // clear() --> clear function is used to clear the content of the HashSet.
        hs.clear();
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

    }
}
