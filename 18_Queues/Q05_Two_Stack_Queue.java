import java.util.*;

public class Q05_Two_Stack_Queue {

    static class Queue{

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty()
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // enque()
        public static void enqueue(int data){
            // Emptying Stack s1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            // pushing s2 elements in s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // deque()
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        // peek() 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);


        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}
