/*  Deque --> Double ended queue --> In JCF
    Methods in Deque:-
    addFirst()
    addLast()
    removeFirst()
    removeLast()
    getFirst()
    getLast()
*/

import java.util.*;
public class Q07_Deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(50);
        dq.addLast(40);
        dq.addFirst(100);

        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq);
    }
}
