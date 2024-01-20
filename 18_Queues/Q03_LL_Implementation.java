// Queue implementation using Linked List

public class Q03_LL_Implementation {
    
     // Node Class for nodes --> LL
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // add  --> enqueue
        public static void enqueue(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }
            
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
        }

        // remove --> dequeue
        public static int dequeue(){

            if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
            }

            int front = head.data;  //storing first element

            // if Queue(LL) have only single element
            if(tail == head){   
                tail = head = null;
            }else{                       // if queue(LL) have more than one element
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
                }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

        System.out.println(q.isEmpty());
    }
}
