import java.util.*;

public class D04_Traversing_Deque{

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10); //addFirst(x) --> throws exception
        d.offerLast(20);  // addLast(x) 
        d.offerFirst(5);
        d.offerLast(15);

        // First to Last

        // One Way of Traversing from First to Last
        Iterator it = d.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }
        System.out.println();

        // Another Way of Traversing from First to Last  --> for each loop
        for(int x : d)
            System.out.print(x + " ");
        System.out.println();

        
        // Last to First --> descendingIterator()
        Iterator itr = d.descendingIterator();  
        while(itr.hasNext())
            System.out.print(itr.next() + "  ");

    }

}