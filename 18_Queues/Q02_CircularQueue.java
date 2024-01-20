// Circular queue array implementation


public class Q02_CircularQueue {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear ==-1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // add  --> enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            // corner case --> adding 1st element
            if(front == -1){
                front = 0; 
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // remove --> dequeue
        public static int remove(){

            if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
            }
            
            int result = arr[front];
            front = (front+1)%size;

            // last element delet
            if(rear == front){
                rear = front = -1;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
                }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        
    }
}
