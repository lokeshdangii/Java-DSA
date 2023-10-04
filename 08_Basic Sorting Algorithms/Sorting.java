import java.util.*; // will add every package, class etc

// Arrays package have inbuilt sort function 
   import java.util.Arrays; 
 
     // collection package is used for sorting in descending order
     // it also contains -> import java.util.Arrays;
import java.util.Collections; 


public class Sorting {

    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length -1; turn++){  // turns 0 to n-2
            int swap = 0; 
            for(int j=0; j<arr.length-1 - turn;j++){
                if(arr[j]>arr[j+1]){ // for descending change the sign(>)
                    // swapping
                    swap++;
                 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                    System.out.println("if condition is working");
                   // System.out.println("value of swap" + " "+ swap);
                }    
                if(swap==0){
                    System.out.println("No Swapping");
                    break;
                  
                 } 
                 }   
                  
        }
        }

        public static void selectionSort(int arr[]){
            for(int i =0; i<arr.length-1;i++){
                int minPos = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPos]< arr[j]){
                        minPos = j;
                    }
                }
                //swap
                  int temp = arr[minPos];
                  arr[minPos] = arr[i];
                  arr[i] = temp;
            }

        }

        public static void insertionSort(int arr[]){
            for(int i=1; i<arr.length-1;i++){
                int curr = arr[i];
                int prev = i-1;
                
                // finding out the correct position to insert
                while(prev>=0 && arr[prev] < curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                 // insertion
                 arr[prev+1] = curr;

            }
        }
 
        public static void countingSort(int arr[]){
            int largest = Integer.MIN_VALUE;
            for(int i=0; i<arr.length;i++){
                largest = Math.max(largest, arr[i]);
            }

              int count[] = new int[largest +1];
              for(int i= 0; i<arr.length;i++){
                 count[arr[i]]++;
              }

              // sorting
              int j=0; 
              for(int i=0;i<count.length;i++){ 
                // for descending -> for(int i=count.length;i>=0;i--)
                while(count[i]>0){
                   arr[j] = i;
                   j++;
                   count[i]--;
                }
              }
        }
       
        public static void printArray(int arr[]){           
           
            for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
   public static void main(String args[]){
  int arr[] = {5, 4, 3, 1, 2};
//    int arr[] = {1, 2, 3, 4, 5};
   //int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
    //  int arr[] = {3,6,2,1,8,7,4,5,3,1};
   bubbleSort(arr);
   // selectionSort(arr);
   // insertionSort(arr);
   //  countingSort(arr);

   // Arrays.sort(arr); // will sort array in ascending order

    // Arrays.sort(arr,0,3); // will sort array form 0 index to 2
     // number 3 is non inclusive.

    // Arrays.sort(arr, Collections.reverseOrder()); 
       // is package ko use krne k liye
      // Integer ka object banana padega -> int ko Integer se replace krna padega                                            
                                                  
    
    

    printArray(arr);
     
   } 
}  



