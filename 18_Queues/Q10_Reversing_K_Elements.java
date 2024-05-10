/*
Reversing the first K elements of a Queue
We have an integer k and a queue of integers, we need to reverse the order of the first k
elements of the queue, leaving the other elements in the same relative order.

Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
 */

import java.util.*;
public class Q10_Reversing_K_Elements {
    
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);q.add(60);q.add(70);q.add(80);q.add(90);q.add(100);
        int k = 5;

        Stack<Integer> s1 = new Stack<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=0;i<k;i++){
            s1.push(q.remove());
        }

        while(!q.isEmpty()){
            q2.add(q.remove());
        }

        //Stack to Queue
        while (!s1.isEmpty()) {
            q.add(s1.pop());
        }

        // Q2 to Q
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }

        //printing
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }




    }
}
