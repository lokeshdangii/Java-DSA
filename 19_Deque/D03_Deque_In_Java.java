import java.util.*;

/*
 * Deque in Java provides two set of functions.
 * One set of function do not throw any exception instead return special value to indicate failure like 'null'
 * The another set throws exception if something goes wrong.   
 * offerFirst and offerLast adds data to front and rear of the queue
 */

public class D03_Deque_In_Java {
    
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10); //addFirst(x) --> throws exception
        d.offerLast(20);  // addLast(x) 
        d.offerFirst(5);
        d.offerLast(15);

        System.out.println(d.peekFirst()); //getFirst()
        System.out.println(d.peekLast());  // getLast()

        int a = d.pollFirst(); // removeFirst // remove and return element from first and last
        int b = d.pollLast();  // removeLast

        System.out.println(a + "  " + b);

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d.pollLast());
        System.out.println(d.pollLast());
        // System.out.println(d.removeLast());
        System.out.println(d.pollLast()); 
        System.out.println(d.pollLast());
        // peekFirst and Last will return null when called on empty queue i.e does not throw exception

        /*
         * O/P:- without removeLast()
         *  5
            15
            5  15
            10
            20
            20
            10
            null
            null
         
        O/P:- with removeLast()
            5
            15
            5  15
            10
            20
            20
            10
            Exception in thread "main" java.util.NoSuchElementException
            	at java.base/java.util.LinkedList.removeLast(LinkedList.java:294)
            	at D03_Deque_In_Java.main(D03_Deque_In_Java.java:31)

         */

    }
}
