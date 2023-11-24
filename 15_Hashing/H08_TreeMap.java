/*
 * TreeMap
 * Keys are sorted
 * put(insert,get,remove are O(logn) )
 * 
 * Treemap is not implement using arrays, linkedlist or doubly linked list.
 * Treemap are implement by Red Black Trees (is a special type of BST (self balancing))
 * TreeMap<  > tm = new TreeMap<>();
 */


import java.util.HashMap;
import java.util.TreeMap;

public class H08_TreeMap {
    public static void main (String args[]){

        // TreeMap
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",130);
        tm.put("China",135);
        tm.put("Nepal",20);
        tm.put("America", 40);

        // HashMap
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",130);
        hm.put("China",135);
        hm.put("Nepal",20);


        System.out.println(tm); // prints in sorted order
        System.out.println(hm); // prints in normal random order


    }
}
