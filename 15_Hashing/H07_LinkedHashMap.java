import java.util.LinkedHashMap;
import java.util.HashMap;

public class H07_LinkedHashMap{

    public static void main(String args[]){
        
        // Linked HashMap
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",130);
        lhm.put("China",135);
        lhm.put("Nepal",20);


        // HashMap
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",130);
        hm.put("China",135);
        hm.put("Nepal",20);
  

        // print LinkedHashMap -> will be printed in Insertion Order
        System.out.println(lhm);   // {India=130, China=135, Nepal=20}

        // print HashMap  --> will be printed in Random Order
        System.out.println(hm);    // {China=135, Nepal=20, India=130}



    
    }
}