// Frequencies of array elements
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.HashSet;

public class H05_Frequncies {

    public static void countFrequencies(int arr[]){

        HashMap <Integer,Integer> hm = new HashMap<>();

        for(int ele : arr)
            hm.put(ele, hm.getOrDefault(ele, 0)+1);

        // Traversal on HashSet

        // 1. Traversal using entrySet()
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        // 2. Traversal using set(keys) and for each loop
        HashSet<Integer> hs = new HashSet<>(hm.keySet());
        for(int key : hs ){
            System.out.println(key + " " + hm.get(key));
        }

        // 3. Traversal by Iterator
        Iterator<Integer> i = hs.iterator();
        while(i.hasNext()){
            int ele = i.next();
            System.out.println(ele + " " + hm.get(ele));
        }        
    }

    public static void main(String args[]){
        int arr[] = {50,50,10,40,10};
        countFrequencies(arr);
    }
}
