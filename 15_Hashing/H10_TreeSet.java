/*
 * TreeSet
 * Sorted in ascending order
 * Null values are not allowed
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class H10_TreeSet {
    public static void main (String args[]){
        // HashSet -> Random Order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10); hs.add(20); hs.add(30); hs.add(40);
        System.out.println(hs);
        
        // LinkedHashSet -> Prdered Using DLL
        LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();
        Lhs.add(90); Lhs.add(20); Lhs.add(33); Lhs.add(40);
        System.out.println(Lhs);

        // TreeSet -> Preordered Using DLL
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(90); ts.add(20); ts.add(33); ts.add(40);
        System.out.println(ts);
   
        // Iterating by for each Loop
        // for(Integer k : Lhs)
        //     System.out.println(k);

        // for(Integer k : hs)
        //     System.out.println(k);

        // for(Integer k : ts)
        //     System.out.println(k);
    }
}
