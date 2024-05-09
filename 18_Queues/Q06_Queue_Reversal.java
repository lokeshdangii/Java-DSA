import java.util.*;

public class Q06_Queue_Reversal {

    public static void reverseQueue(Queue<Integer> q){
    
        Stack<Integer> s = new Stack<>();

        //Step1 --> pushing q ele in stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        //Step2 --> pushing back ele in q from stack
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);
        
        // Printing
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
