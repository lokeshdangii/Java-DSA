public class Q01_Array_Implementation {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;


        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear ==-1;
        }

        // add  --> enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }

        // remove --> dequeue
        public static int remove(){

            if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
            }
            int ele = arr[0];

            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear-=1;
            return ele;
        }

        public static int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
                }

            return arr[0];
        }
    }

    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.isEmpty());
    }
}
