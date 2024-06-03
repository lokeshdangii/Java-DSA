// Priority Queue 
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_JCF {
    public static void main(String args[]){
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Comparator is a interface in java and reversOrder function revers the logic in implementation. 

        pq.add(4);
        pq.add(6);
        pq.add(2);
        pq.add(0);

        // pq.poll() fun remove and return the min element
        //pq.peek() fn returns the min (top) of the heap

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
