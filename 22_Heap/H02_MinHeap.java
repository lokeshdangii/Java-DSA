// MinHeap 0 based indexing implementation by array

public class H02_MinHeap {
    
    static class MinHeap{
        int arr[];
        int size;
        int capacity;

        MinHeap(int c){
            arr = new int[c];
            this.size = 0;
            this.capacity = c;
        }


        public int left(int index){
            return 2*index + 1;
        }

        public int right(int index){
            return 2*index +2;
        }

        public int parent(int index){
            return (index-1)/2;
        }

        public void insert(int val){
            // base condition
            if(size == capacity){
                System.out.println("Heap is full --> Overflow");
                return;
            }

            size++;
            arr[size-1] = val;

            for(int i = size-1; i!=0 && arr[(i-1)/2] > arr[i];){  //arr[parent(i)] > arr[i];
                int temp = arr[i];
                arr[i] = arr[(parent(i))];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }

        public void minHeapify(int i){  // TC --> O(logn)
            int left = left(i); int right = right(i);
            int minimum = i;

            if(left < size && arr[left] < arr[minimum]){
                minimum = left;
            }

            if(right < size && arr[right] < arr[minimum]){
                minimum = right;
            }

            if(minimum != i){
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
                minHeapify(minimum);
            }
        }

        public int extractMin(){  // TC --> O(logn)
            if(size == 0){
                return Integer.MAX_VALUE;
            }

            if(size ==1){
                size--;
                return arr[0];
            }

            int ans = arr[size-1];

            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;

            size--;
            minHeapify(0);
            return ans;

        }

        void decreaseKey(int i, int val){
            arr[i] = val;

            while(i!=0 && arr[parent(i)] > arr[i]){
                // swap
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;

                // changing i
                i = parent(i);
            }
        }


        public void builHeap(){ // TC --> O(nlogn)
            for(int i = (size-2)/2; i>=0;i--){
                minHeapify(i);
            }
        }

        public void maxHeapify(int i){
            int left = left(i);
            int right = right(i);
            int largest = i;

            if(left < size && arr[left] > arr[largest])
                largest = left;

            if(right < size && arr[right] > arr[largest]){
                largest = right;
            }

            if(largest != i){
                // swap
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                minHeapify(largest);
            }
            
        }

        void heapSort(int arr[], int n){
            builHeap();
            for(int i=n-1; i>=1;i--){
                // swap 
                // swap(arr[0],arr[i]);
                maxHeapify(i);
            }
        }
    }
}
