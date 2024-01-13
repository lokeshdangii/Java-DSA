// Stack implementation using LL

public class S02_Stack {

    static class Node{
        int data;
        Node next;
        // 1st Node
        Node(int data){   
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        // isEmpty()
        public static boolean isEmpty(){
            return head == null;
        }

        // push()
        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
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
