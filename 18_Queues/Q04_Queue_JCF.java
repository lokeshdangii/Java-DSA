import java.util.*;
// In Java Queue is a Interface --> we can not create its object 
// We can Implement Queue using the Linked List and ArrayDeque class.

public class Q04_Queue_JCF {
    public static void main(String[] args) {

        //Implementation using LinkedList class
        Queue<Integer> q = new LinkedList<>();

        //Implementation using LinkedList class
        // Queue<Integer> = new LinkedList<>();

        q.add(2);
        q.add(4);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
