import java.util.*;

// Deifne set
// Set => Set<String>keys = hm.keySet();  .keySet() gives collection of keys of hm

public class H02_IterationOnHM{
    public static void main(String args[]){

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Sachin",10);
        hm.put("Sehwag",44);
        hm.put("Dhoni",7);
        hm.put("Virat",18);
        hm.put("Rohit",45);  


        // Iterating on HashMap

        // .keySet() gives collection of keys of hm
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}