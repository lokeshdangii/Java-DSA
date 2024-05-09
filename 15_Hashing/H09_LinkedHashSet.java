// Linked HashSet --> Order Set same as Linked HashMap

import java.util.LinkedHashSet;
import java.util.HashSet;

public class H09_LinkedHashSet {
    
    public static void main (String args[]){
        // HashSet -> Random Order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10); hs.add(20); hs.add(30); hs.add(40);
        System.out.println(hs);
        
        // LinkedHashSet -> Prdered Using DLL
        LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();
        Lhs.add(90); Lhs.add(20); Lhs.add(33); Lhs.add(40);
        System.out.println(Lhs);
   
        // Iterating by for each Loop
        for(Integer k : Lhs)
            System.out.println(k);

        for(Integer k : hs)
            System.out.println(k);
    }
}
