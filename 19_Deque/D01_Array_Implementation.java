public class D01_Array_Implementation {

    static class Deque{
        static int size;
        int arr[];
        int cap;

        Deque(int c){
            cap = c;
            arr = new int[cap];
            size = 0;
        }


        public boolean isFull(){
            return (size == cap);
        }

        public boolean isEmpty(){
            return (size == 0);
        }

        public int size(){
            return size;
        }

        public void insertFront(int data){
            if(isFull()){
                System.out.println("Deque is Full");
                return;
            }

            if(isEmpty()){
                arr[0] = data;
                size++;
                return;
            }

            for(int i=size-1;i>=0;i--){
                arr[i+1] = arr[i];
            }

            arr[0] = data;
            size++;
            return;
        }

        public void insertRear(int data){
            if(isFull()){
                return;
            }

            // if(isEmpty()){
            //     arr[0] = data;
            //     size++;
            //     return;
            // }

            arr[size] = data;
            size++;
        }

        public int deleteFront(){

            if(isEmpty()){
                System.out.println("Deque is empty");
                return -1;
            }

            int ele = arr[0];
            for(int i=0;i<size-1;i++){
                arr[i] = arr[i+1];
            }

            size--;
            return ele;

        }

        public int deleteRear(){
            if(isEmpty()){
                System.out.println("Deque is empty");
                return -1;
            }

            int ele = arr[size-1];
            size--;
            return ele;
        }

        public int getFront(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

        public int getRear(){
            if(isEmpty()){
                return -1;
            }
            return arr[size-1];
        }
        
    }
    public static void main(String[] args) {
    // insertFront(), insertRear(), deleteFront(), deleteRear() getFront(), getRear(), size(), isFull(), isEmpty()
        Deque dq = new Deque(5);
        System.out.println(dq.isEmpty());
        dq.insertFront(10);
        dq.insertFront(20);
        dq.insertRear(30);
        dq.insertRear(40);
        dq.insertFront(50);


        System.out.println("Front of DQ : " + dq.getFront());
        System.out.println("Rear of DQ : " + dq.getRear());

        while(!dq.isEmpty()){
            System.out.println(dq.deleteFront());
        }

    }
}
