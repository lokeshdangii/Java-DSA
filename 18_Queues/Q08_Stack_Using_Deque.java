import java.util.*;

public class Q08_Stack_Using_Deque {

    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        public static void push(int data){
            dq.addLast(data);
        }

        public static int pop(){
            return dq.removeLast();
        }

        public static int peek(){
            return dq.getLast();
        }
        
    }
    
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}
