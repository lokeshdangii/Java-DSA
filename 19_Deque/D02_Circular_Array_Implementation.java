/*
 * insertRear(x) --> rear = (rear+1)%cap
 * deleteFront() --> front = (front+1)%cap
 * 
 * insertFront(x) --> front = (front-1+cap)%cap
 * deleteRear()  -->  rear = (rear-1+cap)%cap     // cap is added to ensure that front and rear will not be negative
 * 
 * we can always find rear as [(front + size -1)%cap]
 */

public class D02_Circular_Array_Implementation {

    static class Deque{
        static int arr[];
        static int front,size,cap;

        Deque(int c){
            arr = new int[c];
            cap = c;
            front = 0;
            size = 0;
        }

        public boolean isEmpty(){
            return front == -1; 
        }

        public boolean isFull(){
            return size == cap; 
        }

        public int getFront(){
            if(isEmpty()){
                return -1;
            }else{
                return arr[front];
            }
        }

        public int getRear(){
            if(isEmpty()){
                return -1;
            }else{
                return arr[(front + size -1)%cap];
            }
        }

        public int deleteFront(){
            if(isEmpty())
                return -1;
            int ele = arr[front];
            front = (front+1)%cap;
            size--;
            return ele;
        }

        public void insertRear(int data){
            if(isFull()){
                return;
            }

            int rear = (front + size) % cap;
            // int new_rear = rear +1;
            arr[rear] = data;
            size++;

            return;
        }

        public void insertFront(int data){
            if(isFull()){
                return;
            }

            front = (front + cap -1)%cap;
            arr[front] = data;
            size++;
            return;
        }

        public int deleteRear(){
            if(isEmpty()){
                return -1;
            }
            int rear = (front + size -1 )%cap;
            int ele = arr[rear];
            size--; // as we are not maintaining rear we can simply decrement size --> we can get rear by size --> (front + size -1)%cap
            return ele;
        }
    }
    public static void main(String args[]){
        Deque dq = new Deque(4);

        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(30);
        dq.insertRear(44);;

        System.out.println("Front : " + dq.getFront());
        System.out.println("Rear : "+ dq.getRear());

        for(int i=0;i<Deque.cap;i++){
            System.out.println(dq.deleteFront());
        }
    }
}
