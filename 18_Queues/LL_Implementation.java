public class LL_Implementation {
    
    static class Node{
        int data;
        Node next;
        // 1st Node
        Node(int data){   
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void enqueue(int data){
            Node newNode = new Node(data);

             // when no element --> LL is empty
             if(head == null){
                head = newNode;
                return;
            }

            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }

            tmp.next = newNode;
            newNode.next = null;
        }

        public static int dequeue(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }

            int ele = head.data;
            head = head.next;
            return ele;
        }

        public static int peek(){
            return head.data;
        }

        public static int rear(){
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            
            return tmp.data;
        }

        public static void printQueue(){
            if(head == null){
                System.out.println("Queue is empty");
                return;
            }

            // if single element
            if(head.next == null){
                System.out.println(head.data);
                return;
            }

            Node tmp = head;
            while(tmp.next != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }

            System.out.println(tmp.data);
        }
    }

    public static void main(String args[]){
        Queue q1 = new Queue();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);

        q1.printQueue();
        System.out.println(q1.isEmpty());
        q1.dequeue();
        System.out.println("After Dequeue operatiosn");
        q1.printQueue();
        System.out.println(q1.isEmpty());
    }
}


