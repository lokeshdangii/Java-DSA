import java.util.ArrayList;

// Stack implementation using ArrayList
public class S01_Stack {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty()
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push()
        public static void push(int data){
            list.add(data);
        }

        // pop()
        public static int pop(){
            if(isEmpty()){
                return -1; // when stack is empty
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);

            return top; // returning the removed element 
        }

        //peek()  --> in C++ Top
        public static int peek(){
            if(isEmpty()){
                return -1; // when stack is empty
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
