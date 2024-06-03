public class H01_Implementaion {
    // heap implementation 0 based indexing
    public static class Heap{
        int arr[];
        int capacity;
        int size;

        Heap(int capacity){
            this.arr = new int[capacity];
            this.capacity = capacity;
            this.size = 0;
        }

        public void swap(int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        public void insertinHeap(int val){
            if(size == capacity){
                System.out.println("Heap is overflow");
                return;
            }

            size++;
            int index = size;
            arr[index] = val;

            // take the val to its correct position
            while(index > 1){
                int parentIndex = index/2;
                if(arr[index] > arr[parentIndex]){
                    swap(index,parentIndex);
                    index = parentIndex;
                }else{
                    break;
                }
            }
        }

        public void printHeap(){
            for(int i=1;i<=size;i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

        public int deletefromHeap(){ // this method will delete the root
            /*
             * Deletion in Heap is a two step process
             * 1)--> replace root with the last node
             * 2)--> replcae the new root with correct position (Heapification)
             */
            int ans = arr[1];

            arr[1] = arr[size];
            size--;

            int index = 1;
            while(index < size){
                int leftIndex = 2*index;
                int rightIndex = 2*index +1;

                // find out sabse bado kon among the three
                int largestKaIndex = index;
                
                if(leftIndex <= size && arr[largestKaIndex] < arr[leftIndex]){
                    largestKaIndex = leftIndex;
                }

                if(rightIndex <= size && arr[largestKaIndex] < arr[rightIndex]){
                    largestKaIndex = rightIndex;
                }

                // no change
                if (index == largestKaIndex){
                    break;
                }else{
                    swap(index, largestKaIndex);
                }
            }
            return ans;
        }

        public void heapify(int arr[], int n, int index){
            int leftIndex = 2*index;
            int rightIndex = 2*index+1;
            int largestKaIndex = index;

            if(leftIndex<= n && leftIndex > largestKaIndex){
                largestKaIndex = leftIndex;
            }

            if(rightIndex <=n && rightIndex > largestKaIndex){
                largestKaIndex = rightIndex;
            }
            //after these 2 conditions largestKaIndex will be pointing towards largest elemnt among 3

            if(index != largestKaIndex){
                swap(index, largestKaIndex);
                index = largestKaIndex;
                heapify(arr, n, index);  // recursion sambhalega
            }
        }

        // builHeap function to build an heap from the array
        public void builHeap(int arr[], int n){
            for(int index = n/2; index >0;index --){
                heapify(arr, n, index);
            }
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void heapSort(int arr[], int n){
            while(n!=1){
                swap(1,n);
                n--;
                heapify(arr, n, 1);
            }
        }
    }
    public static void main(String args[]){
        Heap h = new Heap(10);
        h.insertinHeap(15);
        h.insertinHeap(22);
        h.insertinHeap(5);
        h.insertinHeap(50);
        h.insertinHeap(45);
        h.printHeap();

        h.deletefromHeap();
        h.printHeap();

        // int arr[] = {-1,5,10,15,20,25,12};
        // int n = 6;


        
    }
}
